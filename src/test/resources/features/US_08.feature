Feature: As a user, I should be able to delete a file/folder.

  @deletefile
  Scenario Outline: Verify users delete a file/folder

    Given user "<username>" "<password>" on the dashboard page
    When the user clicks the Files module
    When the user clicks action-icon  from any <file> on the page
    And user choose the Delete f option
    When the user clicks the Deleted files sub-module on the left side
    Then Verify the <deletedFile> is displayed on the page.

    Examples:


      | username | password    |    file | deletedFile|
      | User55   | Userpass123 |1        |1          |

