@signin
Feature: Validating Login page

  @TS_signin_01
  Scenario: User on login page and login with empty username and valid password
    Given The user is on signin page
    When The user clicks Login with empty username "" and valid password "Thankgmail123"
    Then It should display an error message "Please fill out this field." below Username textbox


    @TS_signin_02
  Scenario: User on login page and login with valid username and empty password
    Given The user is on signin page
    When The user clicks Login with username "numpyarshsquashers@gmail.com" and empty password ""
    Then It should display an error message "Please fill out this field." below Password textbox


      
      
     @TS_signin_03
  Scenario: User on login page and login with invalid username and invalid password 
    Given The user is on signin page
    When The user clicks Login with invalid username "bdhgfsj" and invalid password "gsfhsgs"
    Then It will display an error message "Invalid Username and Password" 
      
      @TS_signin_04
  Scenario: User on login page and login with valid username and invalid password
    Given The user is on signin page
    When The user clicks Login with valid username "numpyarshsquashers@gmail.com" and invalid password "sjdhfsjkh"
    Then It should display an error message "Please check your password." password not valid 

      
      @TS_signin_05
  Scenario: User on login page and login with valid username and  valid password
    Given The user is on signin page
    When The user clicks Login with valid username  "arshsquashers@gmail.com" and valid password "Welcome12#"
    Then It should display "You are logged in" message with username in top right corner
    

      
     @TS_signin_06
  Scenario: Sign-Out scenario
    Given The user is logged in
    When The user clicks on Sign-Out link
    Then The user gets the message "Logged out successfully"
      
      
      
      
      