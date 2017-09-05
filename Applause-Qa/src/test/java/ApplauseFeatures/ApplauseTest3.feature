Feature: Beacons features testing

Scenario: Assign individual 
Given click on beacons menu link
Then select the customer1, brand1, location1 from the respective dropdowns
Then click on Assign individual button
Then enter the beacon id 
And click on save button

Scenario: Bulk Assign Action
Given click on beacons menu link
Then select the customer2, brand2, location2 from the respective dropdowns
Then click on Bulk Action button
Then click on Assign
Then do the file upload
And click on save button

Scenario: Bulk Assign Action
Given click on beacons menu link
Then select the customer3, brand3, location3 from the respective dropdowns
Then click on Bulk Action button
Then click on Assign
Then do the file upload
And click on save button

Scenario: Bulk Unassign Action
Given click on beacons menu link
Then select the customer3, brand3, location3 from the respective dropdowns
Then click on Bulk Action button
Then click on Unassign
Then do the file upload
And click on save button

Scenario: Bulk Pair Action
Given click on beacons menu link
Then select the customer3, brand3, location3 from the respective dropdowns
Then click on Bulk Action button
Then click on Pair
Then do the file upload
And click on save button

Scenario: Bulk Unpair Action
Given click on beacons menu link
Then select the customer3, brand3, location3 from the respective dropdowns
Then click on Bulk Action button
Then click on Unpair
Then do the file upload
And click on save button

Scenario: Pair individual
Given click on beacons menu link
Then select the customer3, brand3, location3 from the respective dropdowns
Then select the beacon checkbox
Then click on pair individual
Then enter employee id
And click on save button







