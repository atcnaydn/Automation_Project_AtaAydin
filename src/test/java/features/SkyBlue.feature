@Skyblue
Feature: Validate Sky Blue Functionality

Background: 
	Given "skyblue" button exists
	
Scenario: 1 User should be able to change background color to sky blue

	When User clicks on the skyblue button
	Then Background will change to "skyblue"
