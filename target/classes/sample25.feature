Feature: Test Background keyword

Background: HI MURALI
Given HELOO Murali

@smoke
Scenario: signin
Given user enter uid and pwd
And click signin

@regression
Scenario: search
 When user enters bat
 @regression
 Scenario: Addtocart
 When user adding the searched product to the cart
 @regression
 Scenario: payment process
 When user performs payment process

  @smoke
 Scenario: signout
 When user logout of application
 