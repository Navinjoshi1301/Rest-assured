package httpRequest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PostMethod {
    @Test
    void test01() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Navin");
        jsonObject.put("job", "QA");

        RestAssured.baseURI = "https://reqres.in/api/users";
        RestAssured.given().header("Content-type", "applicatipn/json").contentType(ContentType.JSON)
                .body(jsonObject.toString()).when().then().statusCode(201).log().all();
                
    }
}
