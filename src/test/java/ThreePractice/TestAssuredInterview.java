package ThreePractice;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.bson.Document;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;

public class TestAssuredInterview extends ConfigInterview {
    @Test
    public void TestCreatedNewInterviews(){
        Response response = given()
                .spec(specRequest.getRequestAuth(token))
                .when()
                .body(newInterviewsDto)
                .post("/interview");
        System.out.println(response.then().extract().body().asPrettyString());
        response.then().statusCode(200);

        JsonPath jsonPath = response.jsonPath();
        int id = jsonPath.getInt("data._id");

        Document myDoc = connectDB.findInterview(id);
        assertEquals(myDoc.get("_id"), id);
    }
    @Test
    public void TestUpdatedInterviews(){
        Response response = given()
                .spec(specRequest.getRequestAuth(token))
                .when()
                .body(updateInterviewDto)
                .put("/interview");
        response.then().statusCode(200);

        JsonPath jsonPath = response.jsonPath();
        int id = jsonPath.getInt("data._id");
        String name = jsonPath.getString("data.name");
        String growPoints = jsonPath.getString("data.growPoints");

        Document myDoc = connectDB.findInterview(id);
        assertEquals(myDoc.get("_id"), id);
        assertEquals(myDoc.get("name"), name);
        assertEquals(myDoc.get("growPoints"), growPoints);
    }

    @Test
    public void TestNewQuestionForInterviews(){
        Response responseQuest = given()
                .spec(specRequest.getRequestAuth(token))
                .when()
                .body(addQuestionDto)
                .post("/interview-question");
        responseQuest.then().statusCode(200);
        JsonPath jsonPathQuest = responseQuest.jsonPath();
        int idQuest = jsonPathQuest.getInt("data._id");
        Document myDoc = connectDB.findInterviewQuestion(idQuest);
        assertEquals(myDoc.get("_id"), idQuest);
        System.out.println(responseQuest.then().extract().body().asPrettyString());
    }


    @Test
    public void TestAddNewQuestionInterviews(){
        Response response = given()
                .spec(specRequest.getRequestAuth(token))
                .when()
                .body(addQuestInInterview)
                .put("/interview");

        response.then().statusCode(200);

        JsonPath jsonPath = response.jsonPath();
        List<Integer> listIdQuest = jsonPath.getList("data.questions._id");
        int idQuest = listIdQuest.get(0);

        Document myDoc = connectDB.findInterviewQuestion(idQuest);

        assertEquals(myDoc.get("_id"),idQuest);
    }
    @Test
    public void TestUpdateQuestionInInterviews(){
        Response response = given()
                .spec(specRequest.getRequestAuth(token))
                .when()
                .body(updateQuestionInInterview)
                .put("/interview");

        response.then().statusCode(200);

        System.out.println(response.then().extract().body().asPrettyString());

        JsonPath jsonPath = response.jsonPath();
        List<Integer> listIdQuest = jsonPath.getList("data.questions._id");
        List<String> listNameQuest = jsonPath.getList("data.questions.name");
        int idQuest = listIdQuest.get(0);
        String nameQuest = listNameQuest.get(0);
        Document myDoc = connectDB.findInterviewQuestion(idQuest);

        assertEquals(myDoc.get("_id"),idQuest);
        assertEquals(myDoc.get("name"),nameQuest);
    }

}
