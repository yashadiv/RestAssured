package Practice;

import Practice.Config;
import Practice.Dto.Dto.UsersDto.UserDto;
import Practice.Dto.Dto.UsersDto.GeneratedUsers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.bson.Document;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;

public class TestRestAssured extends Config {

    @Test
    public void TestAuthenticationTest(){

        Response response =given().
                spec(specRequest.getRequestNoAuth(user))
                .when()
                .post("/auth/login");

        response.then().statusCode(200);

        JsonPath jsonPath = response.jsonPath();
        String stringUsername = jsonPath.getString("user.username");
        int id = jsonPath.getInt("user._id");

        Document myDoc = connectDb.findUserAdmin();

        assertEquals(myDoc.get("username"), stringUsername);
        assertEquals(myDoc.get("_id"), id);
    }

    @Test(dataProvider = "userData", dataProviderClass = GeneratedUsers.class)
    public void TestCreateUsers(UserDto userDto){
        Response response = given()
                .spec(specRequest.getRequestAuth(token))
                .when()
                .body(userDto)
                .post("/user-auth1");
        System.out.println(response.then().extract().body().asPrettyString());

        JsonPath jsonPath = response.jsonPath();
        int id = jsonPath.getInt("data._id");
        System.out.println("id: "+ id);
    }

    @Test
    public void TestCreateQuest(){
        Response response = given()
                .spec(specRequest.getRequestAuth(token))
                .when()
                .body(quest)
                .post("/theme-question");

        response.then().statusCode(200);

        JsonPath jsonPath = response.jsonPath();
        int id = jsonPath.getInt("data._id");
        String nameQuest = jsonPath.getString("data.name");

        Document myDoc = connectDb.findNewQuestion(id);

        assertEquals(myDoc.get("name"), nameQuest);
        assertEquals(myDoc.get("_id"), id);
    }

    @Test
    @Ignore
    public void TestUpdateQuest(){
        //TODO зависает при подключении. Узнать в чем причина
        Response response = given()
                .spec(specRequest.getRequestAuth(token))
                .when()
                .body(updateQuest)
                .post("/create-lts");

        response.then().statusCode(200);
        String strResp = response.then().extract().body().asPrettyString();
        System.out.println(strResp);
        JsonPath jsonPath = response.jsonPath();
        int id = jsonPath.getInt("data.questionDB._id");

/*
        Document myDoc = connectDb.findNewQuestion(id);


        assertEquals(myDoc.get("_id"), id);*/
    }

    @Test
    public void TestCreateQuiz(){
        Response response = given()
                .spec(specRequest.getRequestAuth(token))
                .when()
                .body(quiz)
                .post("/quiz");

        response.then().statusCode(200);

        JsonPath jsonPath = response.jsonPath();
        int id = jsonPath.getInt("data._id");
        String nameQuest = jsonPath.getString("data.name");

        Document myDoc = connectDb.findNewQuizes(id);

        assertEquals(myDoc.get("name"), nameQuest);
        assertEquals(myDoc.get("_id"), id);
    }
    @Test
    public void TestCreateModules(){
        Response response = given()
                .spec(specRequest.getRequestAuth(token))
                .when()
                .body(module)
                .post("/course-module");

        response.then().statusCode(200);

        JsonPath jsonPath = response.jsonPath();
        int id = jsonPath.getInt("data._id");
        String nameQuest = jsonPath.getString("data.name");

        Document myDoc = connectDb.findNewModules(id);

        assertEquals(myDoc.get("name"), nameQuest);
        assertEquals(myDoc.get("_id"), id);
    }

    @Test
    public void TestCreateCourses(){
        Response response = given()
                .spec(specRequest.getRequestAuth(token))
                .when()
                .body(course)
                .post("/course");

        response.then().statusCode(200);

        JsonPath jsonPath = response.jsonPath();
        int id = jsonPath.getInt("data._id");

       Document myDoc = connectDb.findNewCourses(id);

        assertEquals(myDoc.get("_id"), id);
    }
    @Test
    public void TestCreateExam(){
        Response response = given()
                .spec(specRequest.getRequestAuth(token))
                .when()
                .body(exam)
                .post("/exam");

        response.then().statusCode(200);

        System.out.println(response.then().extract().body().asPrettyString());

        JsonPath jsonPath = response.jsonPath();
        int id = jsonPath.getInt("data._id");

        Document myDoc = connectDb.findNewExams(id);

        assertEquals(myDoc.get("_id"), id);
    }

    @Test
    public void TestCreateTemplates(){
        Response response = given()
                .spec(specRequest.getRequestAuth(token))
                .when()
                .body(template)
                .post("/user-hr-template");

        response.then().statusCode(200);

        System.out.println(response.then().extract().body().asPrettyString());

        JsonPath jsonPath = response.jsonPath();
        int id = jsonPath.getInt("data._id");

        Document myDoc = connectDb.findNewTemplates(id);

        assertEquals(myDoc.get("_id"), id);
    }

    @Test
    public void TestFakeUserAuth(){
        Response response = given()
                .spec(specRequest.getRequestNoAuth(fakeUser))
                .when()
                .post("https://aqa-api.javacode.ru/api/auth/login");

        response.then().statusCode(400);

        JsonPath jsonPath = response.jsonPath();

        String error = jsonPath.getString("error");
        assertEquals(error,"Неверный логин / пароль");
    }
}
