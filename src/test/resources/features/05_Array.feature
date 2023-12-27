
@Array
Feature: Array feature
 
    @Array1
    Scenario: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "arshsquashers@gmail.com" and "Welcome12#"
    And The user click on login button
    Then The user redirected to homepage

    @Array2
    Scenario: Navigating to Array page  
    Given The user is on the "home page" after logged in
    When The user clicks on the Get Started button below Array
    Then The user is redirected to "Array" Page
    
    @Array3
    Scenario: Navigating Arrays in Python page 
    Given The user is in "Array" page
    When The user clicks Arrays in Python link
    Then The user is redirected to "Arrays in Python" page
    When The user clicks the Try here link
    Then The user is redirected to "Try Editor" page
    
    #@Array4
 #		Scenario Outline: The user is able to run code in Editor for Graph page
    #Given The user is in a page having an Editor with a Run button to test
    #When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    #And clicks run button
    #Then The user is presented with the result after run button is clicked
#
    #Examples: 
      #| Sheetname  | RowNumber |
      #| pythonCode |         0 |
#
  #	@Array5
  #	Scenario Outline: The user is presented with error message for invalid code in Editor for Graph page
    #Given The user is in a page having an Editor with a Run button to test
    #When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    #And clicks run button
    #Then The user gets an error message as "NameError: name 'hello' is not defined on line 1"
#
    #Examples: 
      #| Sheetname  | RowNumber |
      #| pythonCode |         1 |
      #
    @Array6
    Scenario: Navigating Arrays Using List page
    Given The user is in "Array" page
    When The user clicks Arrays Using List link
    Then The user is redirected to "Arrays Using List" page
    When The user clicks the Try here link
    Then The user is redirected to "Try Editor" page 
    
    #@Array7
 #		Scenario Outline: The user is able to run code in Editor for Graph page
    #Given The user is in a page having an Editor with a Run button to test
    #When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    #And clicks run button
    #Then The user is presented with the result after run button is clicked
#
    #Examples: 
      #| Sheetname  | RowNumber |
      #| pythonCode |         0 |
#
  #	@Array8
  #	Scenario Outline: The user is presented with error message for invalid code in Editor for Graph page
    #Given The user is in a page having an Editor with a Run button to test
    #When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    #And clicks run button
    #Then The user gets an error message as "NameError: name 'hello' is not defined on line 1"
#
    #Examples: 
      #| Sheetname  | RowNumber |
      #| pythonCode |         1 |
      
    @Array9
    Scenario: Navigating Basic Operations in Lists page
    Given The user is in "Array" page
    When The user clicks Basic Operations in Lists link
    Then The user is redirected to "Basic Operations in Lists" page
    When The user clicks the Try here link
    Then The user is redirected to "Try Editor" page
      
    #@Array10
 #		Scenario Outline: The user is able to run code in Editor for Graph page
    #Given The user is in a page having an Editor with a Run button to test
    #When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    #And clicks run button
    #Then The user is presented with the result after run button is clicked
#
    #Examples: 
      #| Sheetname  | RowNumber |
      #| pythonCode |         0 |
#
  #	@Array11
  #	Scenario Outline: The user is presented with error message for invalid code in Editor for Graph page
    #Given The user is in a page having an Editor with a Run button to test
    #When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    #And clicks run button
    #Then The user gets an error message as "NameError: name 'hello' is not defined on line 1"
#
    #Examples: 
      #| Sheetname  | RowNumber |
      #| pythonCode |         1 |
      
    @Array12
    Scenario: Navigating Applications of Array page 
    Given The user is in "Array" page
    When The user clicks Applications of Array link
    Then The user is redirected to "Applications of Array" page
    When The user clicks the Try here link
    Then The user is redirected to "Try Editor" page
    
    #@Array13
 #		Scenario Outline: The user is able to run code in Editor for Graph page
    #Given The user is in a page having an Editor with a Run button to test
    #When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    #And clicks run button
    #Then The user is presented with the result after run button is clicked
#
    #Examples: 
      #| Sheetname  | RowNumber |
      #| pythonCode |         0 |
#
  #	@Array14
  #	Scenario Outline: The user is presented with error message for invalid code in Editor for Graph page
    #Given The user is in a page having an Editor with a Run button to test
    #When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    #And clicks run button
    #Then The user gets an error message as "NameError: name 'hello' is not defined on line 1"
#
    #Examples: 
      #| Sheetname  | RowNumber |
      #| pythonCode |         1 |
      
    @Array15
    Scenario: Navigating to Practice Questions page
    Given The user is in "Array" page
    When The user clicks Applications of Array link
    Then The user is redirected to "Arrays in Python" page 
    When The user clicks Practice Questions link
    Then The user is redirected to "Practice Questions" page
    
    @Array16
    Scenario: Navigating Practice Questions page
    Given The user is in "Practice Questions" page
    #When The user clicks Search the array link
    Then The user is redirected to "Search the array" page
    
     @TS_array_21
  Scenario Outline: The user is able to run code in tryEditor for Search the array link
    Given The user is on "Question" page of "Search the array" after logged in
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
    And The user clicks on run button
    Then The user should be presented with Run result

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         3 |

  @TS_array_22
  Scenario Outline: The user is able to submit code in tryEditor for Search the array link
    Given The user is on "Question" page of "Search the array" after logged in
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
    And The user clicks on Submit button
    Then The user should be presented with successful submission message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         4 |

  @TS_array_23
  Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Search the array link
    Given The user is on "Question" page of "Search the array" after logged in
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message as "SyntaxError: bad input on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
    
    #When The user clicks Max Consecutive Ones link
    #Then The user is redirected to "Max Consecutive Ones" page
    #When The user clicks Find Numbers with Even Number of Digits link
    #Then The user is redirected to "Find Numbers with Even Number of Digits" page
    #When The user clicks Squares of a sorted Array link
    #Then The user is redirected to "Squares of a Sorted Array" page
    