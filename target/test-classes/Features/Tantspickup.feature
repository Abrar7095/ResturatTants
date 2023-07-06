Feature: Guest Pickup Order and Fulfillment
  
  As a user, I am able to submit and complete a pickup order using PWO

  @CarryOut @Critical @SmokeTest @Regression @DWO-T562
  Scenario: Complete a Carryout Order
    Given I am accessing the site as a guest
    Given I accept all cookies and select the 'Pickup' option on the 'Get Started' page
    And I select location 00766
    And I select the 'Carry-Out' service channel
    And I add a 'Coca-Cola' from the 'Soft Drinks' category in the 'Beverages' menu to my order
    And I view my order
    And I select checkout
    And I select I don't need utensils
    And I select guest checkout
    And I checkout as a carryout guest
    And I checkout as a guest with a mastercard
    And I check-in my order
    When The order is bumped
    Then The order is completed
