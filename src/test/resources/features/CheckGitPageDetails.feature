Feature: GitHub Profile Details

  @prj
  Scenario: Verify User Profile on GitHub
    Given the user is on the Github page
    Then the user should verify the details as follows
      | name         | Gregory Loscombe |
      | location     | Manchester       |
      | public_repos | 7                |
      | followers    | 13               |
      | following    | 29               |