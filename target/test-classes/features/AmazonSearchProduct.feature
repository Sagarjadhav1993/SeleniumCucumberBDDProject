Feature: Acceptance testing to validate test price of products is match with total price in my cart.

  @Search-Product-Positive
  Scenario: Validate search product page
    Given user is on amazon landing page 
    When user search "headphone" in search box
    And hit enter
    Then user navigated to search result page
    When user click on Add to carts from search result page
    And user click on My cart
    Then user navigate to My cart and see list of products 
