Feature: Login page test

Background:
Given chrome driver triggered
When Browser launched
Then Chrome browser displayed

@RegTest @AUTO-2
Scenario: Home page testing the aaplication
Given user landing page
When user enters the user name "Rafi" and password "Nargees"
Then user laneded on Signin page
And check the order number also



