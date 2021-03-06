Feature: Validate user info

  @user
  Scenario: Validate information about user  with given id
    Given  I send GET request to "/user/{userId}" endpoint with "0F8JIqi4zwvb77FGz6Wt" id
    Then  Verify that response status code is 200 and content type is "application/json; charset=utf-8"
    And Verify that user firstname is "Heinz-Georg" and lastname is "Fiedler"
    And Verify that user's country name is "Germany"
    And Verify that user's city name is "Fellbach"

