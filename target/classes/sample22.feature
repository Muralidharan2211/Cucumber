Feature:  LoginTest
Description : Registered user can login with username and password

Scenario: Login with Valid Username and password

Given user opens login page in newtour application
When user enter username as "mercury" and password as "mercury"
And click submit button
Then verify Login success