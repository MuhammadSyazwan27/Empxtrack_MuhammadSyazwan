Feature: User Profile Icon
Scenario Outline: User successfully update a password

Given user login to Empxtrack website
When user managed to open the change password menu
And user managed to change current password to a new one; <oldPassword>, <newPassword>, <confirmPassword>
Then user successfully changed the password

Examples:

|oldPassword|newPassword|confirmPassword|
|Tb123456|tB123456|tB123456|
