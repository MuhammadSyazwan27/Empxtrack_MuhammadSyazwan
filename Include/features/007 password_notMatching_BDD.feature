Feature: User Profile
Scenario: Unsuccessfully update not matching new and confirm password

Given user login and go to main menu
When user navigate to user profile and click to update password
And user mismatch password on new and confirm password
Then user got error of mismatching password