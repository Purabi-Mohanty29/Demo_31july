Feature: Search functionality

Scenario Outline: check search functionality
Given user is on the home page
When user gives keyword in search field
|manipur|
|modi|
And user clicks on the search icon
Then search data should be displayed