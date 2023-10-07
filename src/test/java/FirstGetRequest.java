import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class FirstGetRequest {
//    https://reqres.in/api/users/2

    @Test
    void testCase(){
        Response response=  RestAssured.get("https://reqres.in/api/users/2");
        System.out.println(response.asString());
        System.out.println("Status Code : "+response.statusCode());

    }
}
