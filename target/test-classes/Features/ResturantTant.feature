Feature: Guest Catering Pickup Order and Fulfillment

  @CateringPickup @Critical @SmokeTest @Regression @DWO-T519
  Scenario: Complete a Catering Pickup Order
    Given I am accessing the site as a guest and select the 'Catering' option on the 'Get Started' page
    And I accept all cookies catering pickup page
    And I select 'Catering Pickup' option on the Catering page
    And I select location '03351'
    And I select a date
    And I select a time
    And I add a 'Nugget Tray' from the 'Trays' category to my order and view my order
    And I select guest checkout for catering
    And I checkout as a Catering guest with a mastercard
 #   When the order is bumped
    Then The order is complete
