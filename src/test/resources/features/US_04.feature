
Feature: As a user, I should be able to access to Files module.

  Scenario Outline: verify users can access to Files module
    Given user "<username>" "Userpass123" on the dashboard page
    When user clicks the Files module
    Then verify the page title is "Files - Trycloud QA"

    Examples:
      | username |
      | user25   |
      | user55   |
      | user85   |
      | user115  |


  Scenario Outline: verify users can select all the uploaded files from the page
    Given user "<username>" "Userpass123" on the dashboard page
    When user clicks the Files module
    And user click the top-left checkbox of the table
    Then verify all the files are selected

    Examples:
      | username |
      | user25   |
      | user55   |
      | user85   |
      | user115  |