Feature: Validation of frontpage

  Scenario: Validate all the fields in the frontpage
    Given Browser is open
    When user is on the front page
    Then user should verify the text message after visiting the page "Login"
    
    