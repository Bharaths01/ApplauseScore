Feature: Create/Edit Customer to Employee module entering all the fields

Scenario: Super Admin Login
Given go to applause site
Then enter super admin credentials
And click on login button

Scenario: Create Customer with only mandatory fields
Given click on the customer menu link
Then click the Add new button
Then enter in all the customer field details
And click on save button

Scenario: Create Brand with only mandatory fields
Then select created customer2 from the customer dropdown
Given click on the brand menu link
Then click the Add new button
Then enter in all the brand field details
And click on save button

Scenario: Create Location with only mandatory fields
Then select created brand2 from the brand dropdown
Given click on the location menu link
Then click the Add new button
Then enter in all the location field details
And click on save button

Scenario: Create Employee with only mandatory fields
Then select created location2 from the location dropdown
Given click on the employee menu link
Then click the Add new button
Then enter in all the employee field details
And click on save button

Scenario: Logout and Quit the browser
Given click on the logout link
Then close the browser