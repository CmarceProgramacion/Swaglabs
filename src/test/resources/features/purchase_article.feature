Feature: Comprar producto en SWAGLABS
  As a user
  I need to access the platform SWAGLABS
  To purchase an article

  @Case1
  Scenario Outline: Comprar producto
    Given user enters the page SWAGLABS
    When Enter credentials with the information from the <sheet> and <row>
    And Select the product by adding it to the shopping cart <sheet> and <row>
    Then validates home page message "Checkout: Complete!"

    Examples:
      | sheet | row |
      | 0     | 1   |
      | 0     | 2   |

