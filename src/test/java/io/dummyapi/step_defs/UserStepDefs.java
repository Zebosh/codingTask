package io.dummyapi.step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.dummyapi.pojoClasses.GetRequest;
import io.dummyapi.pojoClasses.Location;


import io.dummyapi.pojoClasses.User;
import io.restassured.response.Response;
import org.junit.Assert;

public class UserStepDefs {

    GetRequest getRequest1=new GetRequest();
    Response response;
    User user;
    Location location;

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

        user= response.body().as(User.class);
        Assert.assertEquals(firstName,user.getFirstName());
        Assert.assertEquals(lastName,user.getLastName());

    }

    @Then("Verify that user's country name is {string}")
    public void verify_that_user_s_country_name_is(String country) {

     location=user.getLocation();
        Assert.assertEquals(country,location.getCountry() );

    }

    @Then("Verify that user's city name is {string}")
    public void verify_that_user_s_city_name_is(String cityName) {

        Assert.assertEquals(cityName, location.getCity());
    }
}
