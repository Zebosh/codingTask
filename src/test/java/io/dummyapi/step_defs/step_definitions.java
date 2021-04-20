package io.dummyapi.step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.dummyapi.utilities.ConfigurationReader;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import java.util.Map;
import static io.restassured.RestAssured.given;


public class step_definitions {

    Response response;
    String appID="607d704116c67b0d51eda699";
    Map<String,Map<String, Object>> user;

    @Given("I send GET request to {string} endpoint with {string} id")
    public void i_send_GET_request_to_endpoint_with_id(String endpoint, String userID) {

        RestAssured.baseURI= ConfigurationReader.get("api_url");

        response=given().accept(ContentType.JSON)
               .header("app-id",appID)
               .and().pathParam("userId",userID)
               .when().get(endpoint);
    }

    @Then("Verify that response status code is {int} and content type is {string}")
    public void verify_that_response_status_code_is_and_content_type_is(int statusCode, String contentType) {

        Assert.assertEquals(statusCode,response.statusCode());
        Assert.assertEquals(contentType,response.contentType());

    }

    @Then("Verify that user firstname is {string} and lastname is {string}")
    public void verify_that_user_firstname_is_and_lastname_is(String firstName, String lastName) {

        user= response.body().as(Map.class);


       Assert.assertEquals(firstName,user.get("firstName"));
       Assert.assertEquals(lastName,user.get("lastName"));


    }

    @Then("Verify that user's country name is {string}")
    public void verify_that_user_s_country_name_is(String country) {

    Assert.assertEquals(country, user.get("location").get("country"));


    }
}
