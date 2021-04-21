package io.dummyapi.pojoClasses;


import io.dummyapi.utilities.ConfigurationReader;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;


public class GetRequest1 {


    public Response  getOneUser(String endpoint,String userId){

        baseURI= ConfigurationReader.get("api_url");
        String appID="607d704116c67b0d51eda699";

        Response response = given().accept(ContentType.JSON)
                .header("app-id", appID)
                .and().pathParam("userId",userId)
                .when().get(endpoint);

        return response;

    }
}
