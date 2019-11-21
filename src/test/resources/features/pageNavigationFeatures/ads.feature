Feature: As a user I want to be able to navigate from the homepage to the various ads on it
  so that I can get a discount

  @ads
  Scenario Outline: If I click an ad I should be taken to its location
    Given I am at the home page

    When I click an <ad>

    Then I am navigated to the ad’s location

    Examples:
    |ad|
    |25Off|
    |45Off|
    |Top trends|
    |Men's Coats|
    |Women's Coats|
    |Sunglasses|
    |Handbags|