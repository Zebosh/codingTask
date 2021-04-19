package io.dummyapi.step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;

public class step_definitions {
    Response response;
    String appID="607d704116c67b0d51eda699";

    @Given("I send GET request to {string} endpoint with {string} id")
    public void i_send_GET_request_to_endpoint_with_id(String endpoint, String userID) {
       response=given().accept(ContentType.JSON)
               .header("app-id",appID)
               .and().pathParam("userId",userID)
               .when().get(endpoint);
    }

    @Then("Verify that response status code is {int} and content type is {string}")
    public void verify_that_response_status_code_is_and_content_type_is(int statusCode, String contentType) {
        assertEquals(response.statusCode(),statusCode);
        assertEquals(response.contentType(),contentType);
    }

    @Then("Verify that user firstname is {string} and lastname is {string}")
    public void verify_that_user_firstname_is_and_lastname_is(String string, String string2) {

    }

    @Then("Verify that user's country name is {string}")
    public void verify_that_user_s_country_name_is(String string) {

    }
}
