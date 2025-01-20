package MongoDb;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.testng.annotations.AfterClass;

public class ConnectDb {
    private MongoCollection<Document> mongoCol;
    private MongoDatabase mongoDb;
    private MongoClient mongoClient;


    public ConnectDb (){
        mongoClient = MongoClients.create("mongodb://javacode:bestEducationEver@193.233.193.42:27017/javacodeDb?authSource=admin");
        mongoDb = mongoClient.getDatabase("javacodeDb");
    }

    public Document findUserAdmin(){
        mongoCol = mongoDb.getCollection("users");
        Document myDoc = mongoCol.find(new Document("username","divichinskiy_yakov")).first();
        return myDoc;
    }
    public Document findNewQuestion(int id){
        mongoCol = mongoDb.getCollection("themequestions");
        Document myDoc = mongoCol.find(new Document("_id",id)).first();
        return myDoc;
    }
    public Document findNewQuizes(int id){
        mongoCol = mongoDb.getCollection("quizzes");
        Document myDoc = mongoCol.find(new Document("_id",id)).first();
        return myDoc;
    }
    public Document findNewModules(int id){
        mongoCol = mongoDb.getCollection("coursemodules");
        Document myDoc = mongoCol.find(new Document("_id",id)).first();
        return myDoc;
    }
    public Document findNewCourses(int id){
        mongoCol = mongoDb.getCollection("courses");
        Document myDoc = mongoCol.find(new Document("_id",id)).first();
        return myDoc;
    }

    public Document findNewExams(int id){
        mongoCol = mongoDb.getCollection("exams");
        Document myDoc = mongoCol.find(new Document("_id",id)).first();
        return myDoc;
    }
    public Document findNewTemplates(int id){
        mongoCol = mongoDb.getCollection("userhrtemplates");
        Document myDoc = mongoCol.find(new Document("_id",id)).first();
        return myDoc;
    }
    @AfterClass
    public void closes(){
        mongoClient.close();
    }

}

