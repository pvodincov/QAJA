Feature: logOut
Scenario: login on site and logOut
Given User is on Login page url 'https://www.saucedemo.com/'
When User enters UserName 'standard_user'
And User enters Password 'secret_sauce'
And User push button Login
And User push menu and button logOut
Then  User logOut