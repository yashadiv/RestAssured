package ThreePractice.MongoDB;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.testng.annotations.AfterClass;

public class ConnectDB {
    private MongoCollection<Document> mongoCol;
    private MongoDatabase mongoDb;
    private MongoClient mongoClient;
    public ConnectDB (){
        mongoClient = MongoClients.create("mongodb://javacode:bestEducationEver@193.233.193.42:27017/javacodeDb?authSource=admin");
        mongoDb = mongoClient.getDatabase("javacodeDb");
    }
    public Document findInterview(int id){
        mongoCol = mongoDb.getCollection("interviews");
        Document myDoc = mongoCol.find(new Document("_id",id)).first();
        return myDoc;
    }
    public Document findInterviewQuestion(int id){
        mongoCol = mongoDb.getCollection("interviewquestions");
        Document myDoc = mongoCol.find(new Document("_id",id)).first();
        return myDoc;
    }
    @AfterClass
    public void closes(){
        mongoClient.close();
    }
}
