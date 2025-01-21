package Practice;

import Practice.Dto.Dto.CoursesDto;
import Practice.Dto.Dto.ExamDto;
import Practice.Dto.Dto.LoginDto;
import Practice.Dto.Dto.ModuleDto;
import Practice.Dto.Dto.Questions.FactsAndUseCases;
import Practice.Dto.Dto.Questions.LTPDto;
import Practice.Dto.Dto.Questions.QuestDto;
import Practice.Dto.Dto.Questions.VersionDetails;
import Practice.Dto.Dto.Quizes.QuizDto;
import Practice.Dto.Dto.Quizes.VariationsDto;
import Practice.Dto.Dto.Templates.ExamAndCourses;
import Practice.Dto.Dto.Templates.TemplateDto;
import Practice.MongoDb.ConnectDb;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.given;

public class Config {
    protected LoginDto user = new LoginDto("divichinskiy_yakov","+–z9U+v?z>fLcYd");
    protected LoginDto fakeUser = new LoginDto("","");
    protected QuestDto quest = new QuestDto("Как дела?");
    protected QuestDto updateQuest = new QuestDto("version","1028",
            new VersionDetails(0,0,1,"1.0.0"),
            new LTPDto("Как дела?","тест тест","1028",
                    List.of(new FactsAndUseCases("Как дела?","Как дела?")),
                    List.of(new FactsAndUseCases("Как дела?","Как дела?"))));;
    protected QuizDto quiz = new QuizDto("Местный квиз","quiz", true, new VariationsDto(true));
    protected ModuleDto module = new ModuleDto("module1", List.of(1028,1029,1000));
    protected CoursesDto course = new CoursesDto("nameCourse",List.of(new ModuleDto("1000", "module1")));
    protected ExamDto exam = new ExamDto("test","60");
    protected TemplateDto template = new TemplateDto("test", "test",List.of(new ExamAndCourses("1001")),List.of(new ExamAndCourses("1009")));

    protected ConnectDb connectDb = new ConnectDb();
    SpecRequest specRequest = new SpecRequest();
    Response getTokenUser =
            given().spec(specRequest.getRequestNoAuth(user))
                    .when()
                    .post("/auth/login");
    JsonPath jsonPathToken  = getTokenUser.jsonPath();
    protected final String token = jsonPathToken.getString("token");
}
