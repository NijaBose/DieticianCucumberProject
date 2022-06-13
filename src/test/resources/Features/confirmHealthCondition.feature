Feature: feature to test confirm Health Condition

  Scenario: Validating option 1 menu visibility
  
    Given user is on dietiction website to  test option 1 menu
    When User lands on Confirm conditions and Create Plan page
    Then User should see option 1 menu to update the health conditions
    
     Scenario: Validating visibility of Confirm button on option 1 menu 
  
    Given user is on dietiction website to  test option 1 menu confirm button
    When User lands on Confirm conditions and Create Plan page to test confirm button
    Then User should see a button with text CONFIRM in option 1 menu    
    
     Scenario: Validating the option 1 menu interaction
  
    Given user is on dietiction website to  test option 1 menu interaction
    When User lands on Confirm conditions and Create Plan page to test option 1 menu interaction
    Then User can update the health conditions in option 1 menu 
    
    Scenario: Validating that the option 1 menu cannot be modified after confirming
  
    Given user is on dietiction website to  test option 1 menu modified after confirming
    When User clicks the CONFIRM button in option 1 menu
    Then User cannot update the health conditions in option 1 menu 
    
    Scenario: Validating option 2 menu visibility
  
    Given user is on dietiction website to  test option 2 menu details
    When User lands on Confirm conditions and Create Plan page to test option 2 
    Then User should see option 2 menu  details to update the health conditions
    
    Scenario: Validating that the option 2 menu cannot be modified after confirming
  
    Given user is logged on dietiction website to  test option 2 menu modified after confirming
    When User clicks the CONFIRM button in option 2 menu details
    Then User cannot update the health conditions in option 2 menu after confirming
    