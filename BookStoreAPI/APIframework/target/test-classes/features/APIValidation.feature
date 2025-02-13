
Feature: Validating Place API's
 
 @AddPlace
  Scenario Outline: Verify if place is successfully added using addPlaceAPI
    Given User adds place payload with "<name>", "<language>","<address>"
    When User calls "AddPlaceAPI" with "post" http request
    Then User is displayed with success status code 200 
    And "status" in response body is "OK"
    And "scope" in response body is "APP"
    And User verifies place_id created maps to "<name>" using "getPlaceAPI"

  Examples:
    | name            | language  | address                   |
    | Frontline house | French-IN | 29, side layout, cohen 09 |
#   | Brindavan lyt   | Kannada   | 35, Himakunda, brindavan  |

 @DeletePlace
Scenario: Verify the delete place functionality
    Given deletePlace payload
    When User calls "deletePlaceAPI" with "post" http request
    Then User is displayed with success status code 200 
    And "status" in response body is "OK"