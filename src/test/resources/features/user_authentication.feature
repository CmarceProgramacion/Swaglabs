Feature: Authentication SWAGLABS
  As a user
  I need to authenticate
  To enter the platform SWAGLABS

  @Case1
  Scenario Outline: Sign in
    Given user enters the page SWAGLABS
    When Enter credentials with the information from the <sheet> and <row>
    Then validates home page message "Products"

    Examples:
      | sheet | row |
      | 0     | 1   |
      | 0     | 2   |