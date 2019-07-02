Feature: Test Login
Scenario: Login with Valid
Given Open newtour app
When User enters username as "mercury" and password as "mercury"
And submit Login form
Then verify pass


Scenario: Login with InValid
Given Open newtour app
When User enters username as "murali" and password as "murali"
And submit Login form
Then verify fail

