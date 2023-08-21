
@tag
Feature: Validating Place API's

  @tag1
  Scenario: Verify if place is being successfully added using AddPlaceApi
    Given Add place payload
    When user calls "AddPlaceApi" with post http request
    Then the api call got success with status code 200
    And "Status" in response body is "OK"
    And "Scope" in reponse body is "App"
