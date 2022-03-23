@OtherLogin@Smoke 
Feature: Techfios Other login functionality validation 

Background: 
	Given User is on Techfios login page 
	
@OtherScenario1 
Scenario: 1 User should be able to login with invalid credentials 
	When User enters username as "demo@techfios.com" 
	When User enters password as "abc123" 
	And User clicks on Signin button 
	Then User should land on Dasboard page 
@OtherScenario2 
Scenario: 2 User should not be able to login with invalid credentials 

	When User enters username as "demo2@techfios.com" 
	When User enters password as "abc123" 
	And User clicks on Signin button 
	Then User should land on Dasboard page 
@OtherScenario3 
Scenario: 3 User should not be able to login with invalid credentials 
	When User enters username as "demo@techfios.com" 
	When User enters password as "abc1234" 
	And User clicks on Signin button 
	Then User should land on Dasboard page 
	
