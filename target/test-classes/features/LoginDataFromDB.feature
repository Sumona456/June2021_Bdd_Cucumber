@DBLogin
Feature: Techfios other login functionality validation driving the data from MySql database 

Background: 
	Given User is on Techfios login page 
@DbScenario1	
Scenario: User should be able to login with valid credentials 
	and open a new account
	When User enters "username" from mysql database 
	When User enters "password" from mysql database	 
	And User clicks on Signin button 
	Then User should land on Dasboard page 
