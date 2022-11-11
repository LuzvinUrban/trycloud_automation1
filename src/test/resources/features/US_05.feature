Feature:
  As a user, I should be able to access to Files module - Favorites button

  @files
  Scenario Outline: Verify users to add files to Favorites
    Given user on the dashboard page
    When the user clicks the Files module
    When the user clicks action-icon  from any <file> on the page
    And user choose the Add to favorites option
    And user click the Favorites sub-module on the left side
    Then Verify the chosen <fileName> is listed on the table

    Examples:
    |file|fileName|
    |2   |2     |
    |4  |4|
    |6  |6|


