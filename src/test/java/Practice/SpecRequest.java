package Practice;

import Practice.Dto.Dto.LoginDto;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class SpecRequest {
    private String URI = "https://aqa-api.javacode.ru/api";
    public RequestSpecification getRequestNoAuth(LoginDto user) {
        return new RequestSpecBuilder()
                .setBaseUri(URI)
                .setContentType("application/json")
                .setBody(user)
                .build();

    }

    public RequestSpecification getRequestAuth(String token) {
        return new RequestSpecBuilder()
                .setBaseUri(URI)
                .setContentType("application/json")
                .addHeader("Authorization", token)
                .build();
    }

}