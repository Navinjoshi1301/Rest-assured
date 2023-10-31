package httpRequest;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetMethod {
//https://reqres.in/api/users?page=2
    @Test
    void getTest(){
       Response res= get("https://reqres.in/api/users?page=2");

        System.out.println("Status Code : "+res.statusCode());
        System.out.println("Response Body : "+res.getBody().asString());
        System.out.println("Response Time  : "+res.getTime());
        System.out.println("Response Header : "+res.getHeader("Content-type"));
        System.out.println("");
//        validate status code
        int statuscode= res.statusCode();
        Assert.assertEquals(200,statuscode);
    }

    @Test
    void test02() {
//    given when then
        baseURI="https://reqres.in/api/users";
       given().queryParam("page","2").
               when().get().

               then().statusCode(200);
    }
    @Test
    void test03(){
        
    }

}
