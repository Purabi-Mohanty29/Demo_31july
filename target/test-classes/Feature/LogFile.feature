Feature: Validate Login Functionality for swag labs

Scenario Outline: check the login functionality for valid data
Given user is on the login page of swag lab
When user open the excel sheet
And user give input to the excel sheet
And user enter username and password from excel sheet
|standard_user|secret_sauce|
And user click on login button
Then Login should be successful