Feature: User Profile
Scenario: Unsuccessfully key in blank new password

Given user navigate to main menu after login
When user navigates to open the change password menu
And user key in old password but left blank for new password
Then an error message popup