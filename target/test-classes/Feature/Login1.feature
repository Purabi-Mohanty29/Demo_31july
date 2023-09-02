Feature: Validate Login Functionality for swag labs

Scenario Outline: check the login functionality for valid data
Given user is on the login page of swag lab
#When user enter the <username> & <password>
When user enter username,password
|standard_user|secret_sauce|
And user click on login button
Then Login should be successful

#Examples:
#|username|password|
#|standard_user|secret_sauce|
#|problem_user|secret_sauce|