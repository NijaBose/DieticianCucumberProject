Feature: feature to test up Load create plan

  Scenario: Validating the Upload button
  
    Given user is logged on dietiction website to test upload button
    When user lands on create new plan page
    Then User should see a button with name Upload on the page
    
    Scenario: Validating the Upload button with no file selected
  
    Given user is logged on create new plan page to test with no file selected
    When User clicks the Upload button without selecting a document
    Then User should see an error message Only files with extension .pdf are allowed
    
    Scenario: Validating the Upload functionality with incorrect file format
  
    Given user is logged on create new plan page to test incorrect file format
    When User clicks the Upload button by selecting a non-PDF file 
    Then User should get an error message Only files with extension .pdf are allowed
    
    Scenario: Validating the Upload functionality with incorrect file size
  
    Given user is logged on create new plan page to test incorrect file size
    When User clicks the Upload button by selecting a PDF file of size greater than 2MB
    Then User should see an error message PDF File exceeding the size limit of 2MB
  
   Scenario: Validating the Upload functionality with incorrect file format and size
  
    Given user is logged on create new plan page to test incorrect file format and size
    When User clicks the Upload button by selecting a non-pdf file of size greater than 2MB
    Then User should be get an error message Only files with extension .pdf are allowed
  
  Scenario: Validating the Upload functionality with correct file format and size
  
    Given user is logged on create new plan page to test correct file format and size
    When User clicks the Upload button by selecting a pdf file of size less than 2MB
    Then User should see a message File uploaded succesfully
  
    
    
    
    