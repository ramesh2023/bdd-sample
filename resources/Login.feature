Feature: Github

Scenario Outline: Github Login
	Given I navigate to Github login page
	When I enter valid "<username>" and "<password>"
	When I click on login button
	Then Login should be successful
	
Examples: 
|username | password |
| user1		| password1	|
| user2		| password2	|
	

Scenario: Github Logout
	When I click logout button
	Then Logout should be successful
