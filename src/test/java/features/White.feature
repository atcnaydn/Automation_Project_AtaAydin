@White
Feature: Validate White Functionality

Background: 
	Given "white" button exists
	
Scenario: 1 User should be able to change background color to white

	When User clicks on the white button
	Then Background will change to "white"