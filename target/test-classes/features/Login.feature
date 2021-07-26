@LoginFeature
Feature: Login Feature
  Description: This feature will be used to login to SwagLabs Application

  @PositiveLogin @Sanity
  Scenario Outline: Verify that when user enters correct user name and password they should be able to login successfully
    Given User has opened the SwagLabs application
    When User enters the username "<UserName>"
    And User enters the password "<Password>"
    And User clicks on LOGIN button
    Then User should be landed on the swaglabs product Page

    Examples: 
      | UserName      | Password     |
      | standard_user | secret_sauce |

  @NegativeLogin @Sanity
  Scenario Outline: Verify that when user enters incorrect user name and password they should see the error message on login page
    Given User has opened the SwagLabs application
    When User enters the username "<UserName>"
    And User enters the password "<Password>"
    And User clicks on LOGIN button
    Then User should see the error message "<Error>"

    Examples: 
      | UserName      | Password | Error                                                                     |
      | charu@xyz.com | abc123   | Epic sadface: Username and password do not match any user in this service |
