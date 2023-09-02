Feature: Singup functionality

Scenario Outline: check search functionality
Given user is on the signup page
When user gives keyword in fullname field
|Purabi Mohanty|
|Smita Mohanty|
And user gives keyword in Rediffmail ID field
|purabi@gmail.com|
|smita@gmail.com|
And user gives keyword in Password field
|1234|
|5678|
And user gives keyword in Retype password field
|1234|
|5678|
And user clicks on the Create my account  
Then user should be registered
