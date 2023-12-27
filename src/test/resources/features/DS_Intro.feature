@DataStructures-Introduction
Feature: DataStructures-Introduction feature
  

  @tag1
  Scenario: Logging in the portal
     Given The user is on Signin page of DS Algo portal 
    When The user enters valid username "arshsquashers@gmail.com" and password "Welcome12#"
    And The user clicks on login button
    Then The user is redirected to the homepage

  @tag2
  Scenario: Navigating to DataStructures-Introduction page   
   Given The user is on the home page after logged in
    When The user clicks on the Get Started button below Data Structures
    And The user is redirected to "DataStructures-Introduction" Page
    
    @tag3
    Scenario: Navigating DataStructures-Introduction page
     Given The user is in "DataStructures-Introduction" page
    When The user clicks on the Time Complexity link
     Then The user is redirected to "Time Complexity" page
    When The user clicks the Try here link
    Then The user is redirected to "Try Editor" page
    
     Given The user is in "Time Complexity" page
   When The user clicks Practice Questions link
    Then The user is redirected to "Practice Questions" page
    