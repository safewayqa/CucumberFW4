Feature: Login page test


@RegTest @WOO-2
Scenario: Home page testing the aaplication
Given user landing page
When user enters the user name "Rafi" and password "Nargees"
Then user laneded on Signin page
And check the order number also



