@Queue
Feature: Queue feature
  

 @tag1
  Scenario: Logging in the portal
     Given The user is on Signin page of DS Algo portal
    When The user enters valid username "arshsquashers@gmail.com" and password "Welcome12#"
    And The user clicks on login button
    Then The user is redirected to the homepage

  @tag2
  Scenario: Navigating to Array page  
   Given The user is on the home page after logged in
    When The user clicks Get Started button below Queue
    And The user is redirected to "Queue" Page
    
     @tag3
    Scenario: Navigating Implementation of Queue in Python page 
    Given The user is in "Queue" page 
    When The user clicks Implementation of Queue in Python link
    Then The user is redirected to "Implementation of Queue in Python" page
    When The user clicks the Try here link
    Then The user is redirected to "Try Editor" page
    
    Given The user is in "Implementation of Queue in Python" page 
   When The user clicks Practice Questions link
    Then The user is redirected to "Practice Questions Queue" page
    
     @tag4
    Scenario: Navigating Implementation using collections.deque page 
    Given The user is in "Queue" page 
    When The user clicks Implementation using collections.deque link
    Then The user is redirected to "Implementation using collections.deque" page
    When The user clicks the Try here link
    Then The user is redirected to "Try Editor" page
    
    @tag5
    Scenario: Navigating Implementation using array page 
    Given The user is in "Queue" page 
    When The user clicks Implementation using array link
    Then The user is redirected to "Implementation using array" page
    When The user clicks the Try here link
    Then The user is redirected to "Try Editor" page
    
     @tag6
    Scenario: Navigating Queue Operations page 
    Given The user is in "Queue" page 
    When The user clicks Queue Operations link
    Then The user is redirected to "Queue Operations" page
    When The user clicks the Try here link
    Then The user is redirected to "Try Editor" page
    
    