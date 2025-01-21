package ThreePractice;

import Practice.Dto.Dto.LoginDto;
import ThreePractice.DTO.InterviewsDto.NewInterviewsDto;
import ThreePractice.DTO.InterviewsDto.UpdateInterviewsDto;
import ThreePractice.DTO.QuestionDto.NewQuestionForInterviewDto;
import ThreePractice.DTO.QuestionDto.NewQuestionInInterviewDto;
import ThreePractice.DTO.QuestionDto.UpdateQuestionInInterviewDto;
import ThreePractice.MongoDB.ConnectDB;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ConfigInterview {
    private LoginDto user = new LoginDto("divichinskiy_yakov","+–z9U+v?z>fLcYd");
    protected SpecRequestInterviews specRequest = new SpecRequestInterviews();
    ConnectDB connectDB = new ConnectDB();
    Response responseTokenUser = given()
            .spec(specRequest.getRequestNoAuth())
            .when()
            .body(user)
            .post("/auth/login");
    JsonPath jsonPathToken  = responseTokenUser.jsonPath();
    protected final String token = jsonPathToken.getString("token");
    protected UpdateInterviewsDto<NewQuestionInInterviewDto> updateInterviewDto = new UpdateInterviewsDto<NewQuestionInInterviewDto>("newInterview",1020, List.of(),"0","0","test","HR","","1","test","test");
    protected NewInterviewsDto newInterviewsDto = new NewInterviewsDto("newInterviews");
    protected NewQuestionForInterviewDto addQuestionDto = new NewQuestionForInterviewDto(1010);

    Response responseInterview = given()
            .spec(specRequest.getRequestAuth(token))
            .when()
            .get("/interview/1020");

    JsonPath jsonPathInterview = responseInterview.jsonPath();
    int idInterview = jsonPathInterview.getInt("data._id");

    protected UpdateInterviewsDto<NewQuestionInInterviewDto> addQuestInInterview = new UpdateInterviewsDto<NewQuestionInInterviewDto>(jsonPathInterview.getString("data.name"),
            idInterview,
            List.of(new NewQuestionInInterviewDto(5004,idInterview,List.of(),"question")),
            jsonPathInterview.getString("data.questionsSize"),
            jsonPathInterview.getString("data.problemQuestions"),
            jsonPathInterview.getString("data.growPoints"),
            jsonPathInterview.getString("data.type"),
            jsonPathInterview.getString("data.date"),
            jsonPathInterview.getString("data.position"),
            jsonPathInterview.getString("data.feedback"),
            jsonPathInterview.getString("data.video")
    );

    protected UpdateInterviewsDto<UpdateQuestionInInterviewDto> updateQuestionInInterview = new UpdateInterviewsDto<>(jsonPathInterview.getString("data.name"),
            idInterview,
            List.of(new UpdateQuestionInInterviewDto(5004,idInterview,List.of(1021),
                    "question","5","60", "nameTest","subNameTest",1021)),
            jsonPathInterview.getString("data.questionsSize"),
            jsonPathInterview.getString("data.problemQuestions"),
            jsonPathInterview.getString("data.growPoints"),
            jsonPathInterview.getString("data.type"),
            jsonPathInterview.getString("data.date"),
            jsonPathInterview.getString("data.position"),
            jsonPathInterview.getString("data.feedback"),
            jsonPathInterview.getString("data.video")
    );
}
