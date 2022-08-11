#feature is a file what we are testing
Feature: I am validating the Swaglabs application     
#its a prerequisite
Scenario: To test login with valid data
Given Open the browser and go to the Login page swaglabs
When Enter the username
And Enter the password
And Click on login-button
Then Login should be successfull
