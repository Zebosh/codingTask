package io.dummyapi.step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.dummyapi.pojoClasses.Location1;

import io.dummyapi.pojoClasses.GetRequest1;
import io.dummyapi.pojoClasses.User1;
import io.restassured.response.Response;
import org.junit.Assert;

public class UserStepDefs {

    GetRequest1 getRequest1=new GetRequest1();
    Response response;
    User1 user1;
    Location1 location1;

    @Given("I send GET request to {string} endpoint with {string} id")
    public void i_send_GET_request_to_endpoint_with_id(String endpoint, String userID) {
        response = getRequest1.getOneUser(endpoint,userID);

    }

    @Then("Verify that response status code is {int} and content type is {string}")
    public void verify_that_response_status_code_is_and_content_type_is(int statusCode, String contentType) {

        Assert.assertEquals(statusCode,response.statusCode());
        Assert.assertEquals(contentType,response.contentType());

    }

    @Then("Verify that user firstname is {string} and lastname is {string}")
    public void verify_that_user_firstname_is_and_lastname_is(String firstName, String lastName) {

        user1= response.body().as(User1.class);
        Assert.assertEquals(firstName,user1.getFirstName());
        Assert.assertEquals(lastName,user1.getLastName());

    }

    @Then("Verify that user's country name is {string}")
    public void verify_that_user_s_country_name_is(String country) {

     location1=user1.getLocation();
        Assert.assertEquals(country,location1.getCountry() );

    }

    @Then("Verify that user's city name is {string}")
    public void verify_that_user_s_city_name_is(String cityName) {

        Assert.assertEquals(cityName, location1.getCity());
    }
}
