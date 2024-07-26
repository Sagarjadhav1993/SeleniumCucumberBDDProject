Feature: Search and place the order for products

  Scenario: Search experiance for product search in both the home and offers page
    Given User is on Greenkart landing page
    When User search with shortname "Tom" and extracted actual name of product
    And User search for "Tom" shortname in offer page
    Then Validate product name in offers page matches with landing page
