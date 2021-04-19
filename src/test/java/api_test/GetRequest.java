package api_test;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;

import java.util.List;

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

    // Pojo Class sample
    // get one user info and convert it into java class
    // verify user info

    @Test
    public void  getOneUser(){
        Response response = given().accept(ContentType.JSON)
                .header("app-id", appID)
                .and().pathParam("userId","1OuR3CWOEsfISTpFxsG7")
                .when().get("/user/{userId}");

        assertEquals(response.statusCode(), 200);
        assertEquals(response.header("Content-Length"),"426");

        // assert username, lastname, email and phone number
        User user1 = response.body().as(User.class);

        assertEquals(user1.getFirstName(), "Dylan");
        assertEquals(user1.getLastName(), "Vasquez");
        assertEquals(user1.getEmail(), "dylan.vasquez@example.com");
        assertEquals(user1.getPhone(),"017684 69068");


        //assert user location
        Location location = user1.getLocation();

        assertEquals(location.getCountry(), "United Kingdom");
        assertEquals(location.getState(), "Rutland");


    }
}
