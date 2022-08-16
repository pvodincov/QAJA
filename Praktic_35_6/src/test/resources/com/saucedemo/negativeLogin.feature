Feature: negativeLogin
  Scenario: negative login  - empty fields username and password
  Given User is on Login page url "https://www.saucedemo.com/"
  When User push button Login
  Then User see text  error 'Epic sadface: Username is required'