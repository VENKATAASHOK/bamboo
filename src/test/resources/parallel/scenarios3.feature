Feature: Scenario for about link

@About
Scenario: user clicks on the dev about link and check all the page redirects
	Given user is on dev Home Page
	When user clicks on the about link
	And user checks all the links under company info
	And user checks all the links under stem
	And user checks all the links under investors
	And user checks all the links under press
	And user checks all the links under careers