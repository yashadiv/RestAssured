package ThreePractice;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class SpecRequestInterviews {
    private String URI = "https://aqa-api.javacode.ru/api";
    public RequestSpecification getRequestNoAuth() {
        return new RequestSpecBuilder()
                .setBaseUri(URI)
                .setContentType("application/json")
                .build();
    }
    public RequestSpecification getRequestAuth(String token/*, InterviewsDto interviewsDto*/) {
        return new RequestSpecBuilder()
                .setBaseUri(URI)
                .setContentType("application/json")
                .addHeader("Authorization", token)
                //.setBody(interviewsDto)
                .build();
    }
}
