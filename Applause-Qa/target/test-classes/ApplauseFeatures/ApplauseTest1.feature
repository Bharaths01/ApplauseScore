Feature: Create/Edit Customer to Employee module with only mandatory fields

Scenario: Super Admin Login
Given go to applause site
Then enter super admin credentials
And click on login button

Scenario: Create Customer with only mandatory fields
Given click on the customer menu link
Then click the Add new button
Then enter the customer mandatory fields
And click on save button

Scenario: Create Brand with only mandatory fields
Then select created customer1 from the customer dropdown
Given click on the brand menu link
Then click the Add new button
Then enter the brand mandatory fields
And click on save button

Scenario: Create Location with only mandatory fields
Then select created brand1 from the brand dropdown
Given click on the location menu link
Then click the Add new button
Then enter the location mandatory fields
And click on save button

Scenario: Create Employee with only mandatory fields
Then select created location1 from the location dropdown
Given click on the employee menu link
Then click the Add new button
Then enter the employee mandatory fields
And click on save button

Scenario: Assign individual beacon to a location
Given click on the beacon menu link
Then click on the Assign individual button
Then enter the beacon id
And click on save button

Scenario: Pair indiviual beacon to an employee
Then select the added beacon using checkbox
Then click on pair individual button
Then enter the employee id
Then click on search button
Then click on pair button
And pair successfull message is displayed

Scenario: Unpair beacon from an employee
Given click on the beacon menu link
Then select the added beacon using checkbox
Then click on unpair button
Then click on Yes to confirm
And unpair successfull message is displayed


Scenario: Unassign beacon from a location
Given click on the beacon menu link
Then select the added beacon using checkbox
Then click on unassign button
Then click on Yes to confirm
And unassign successfull message is displayed


Scenario: Logout and Quit the browser
Given click on the logout link
Then close the browser
