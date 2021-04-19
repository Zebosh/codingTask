package io.dummyapi.requestHMatchers;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.dummyapi.utilities.ConfigurationReader;

import static org.testng.AssertJUnit.assertEquals;

public class GetRequest {

    @BeforeClass
    public void beforeclass(){
        baseURI= ConfigurationReader.get("api_url");
    }

    // assertion with Hamcrest Matchers
    //verify status code, content-type and total number of users

    String appID="607d704116c67b0d51eda699";
    @Test
    public void getUsers(){

        given().accept(ContentType.JSON)
                .header("app-id",appID)
                .when().get("/user")
                 .then().assertThat().statusCode(200)
                  .and().contentType("application/json")
                  .and().body("total", equalTo(100));

    }


}
