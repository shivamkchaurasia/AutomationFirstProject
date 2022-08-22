Feature: Feature To Test the Create Account Functionality

  @Test1
  Scenario: Validate Create Purchase loan Account Functionality
    Given Chrome browser is open with Website URL
    And Verify Welcome Screen is showing
    When Click on the Continue button
    And Verify Get Started screen is showing
    When Select Purchase a New Home and click on the Save button
    And Verify User is redirected on Occupancy Type Screen
    When Select Occupancy Type and click on the Save button
    And Verify User is redirected on Property Type Screen
    When Select Property Type and click on the Save button
    And Verify User is redirected on Closing Date Screen
    When Select the Closing Date and click on the Save button
    And Verify User is redirected on Borrower Information Screen
    When Enter Borrower Information and click on the Save button
    And Verify User is redirected on Create Account Screen
    When Click on the Create Account button
    And Verify Create Account Screen is showing
    When Enter the all details
    And click on the Register button
    Then verify user is redirected to Login Page
