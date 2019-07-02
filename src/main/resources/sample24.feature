Feature: signup
Scenario Outline: Test signup with different sets of ip

Given User open Signup page
When User enter fname as "<firstname>"
And User enters lname as "<lastname>"
And User enters pne as "<phone>"
And User enters e-mail as "<email>"
And User enters add as "<address>"
And User enters Cty as "<city>"
And User enters ste as "<state>"
And User enters pcode as "<postalcode>"
And User enters ctry as "<country>"
And User enters uname as "<username>"
And User enters pwd as "<password>"
And User enters cpwd as "<confirmpassword>"
Then Click submit button
And verified signup success message

Examples:
|firstname|lastname|phone|email|address|city|state|postalcode|country|username|password|confirmpassword|
|murali|dharan|123|m@gmail.com|no2a|cn|ind|57|india|mur|mura|mura|

