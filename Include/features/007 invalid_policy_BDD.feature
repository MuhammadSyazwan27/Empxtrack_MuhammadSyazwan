Feature: User Profile
Scenario: User unsuccessfully entered password that invalid to system policy

Given User navigate to login Empxtrack website
When User clicks update password from user profile
And User enters password that invalid to the policy
Then User received error message