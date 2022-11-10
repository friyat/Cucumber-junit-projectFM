Feature:

  Scenario Outline: Test login with valid credentials
    Given user on the login page
    When user enters valid "<username>" and valid "<password>" and clicks login button
    Then user should be launched at the dashboard page

    Examples:
      | username | password    |
      | User11   | Userpass123 |
      | User41   | Userpass123 |
      | User71   | Userpass123 |
      | User101  | Userpass123 |

  Scenario: verify users can access to Files module Given user on the dashboard page
    When the user clicks the "Files" module
    Then verify the page title is "Files - Trycloud QA.”
  Scenario: verify users can select all the uploaded files from the page Given user on the dashboard page
    When the user clicks the "Files" module
    And user click the top-left checkbox of the table
    Then verify all the files are selected