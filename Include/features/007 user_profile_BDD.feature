Feature: User Profile Icon
Scenario: User successfully clicked on profile icon to open menu

Given user able to login to the website
When user click scroll down button on top right 
And user click on _view profile_ option
Then user viewed the details of the profile
