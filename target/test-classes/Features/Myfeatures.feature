@login
  Feature: User should be able to login so that user can use functionality of app.
Scenario: User is able to able to login with correct username and correct password.
  Given :User is on the login page
  When :User should be login as username as "username" and password as "password".
  Then :User should be successfully logged in the app.