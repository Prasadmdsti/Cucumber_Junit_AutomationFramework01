Feature: CreateAccount

Background: Below are the common steps for each scenario
    Given user launch chrome browser
    When user opens URL "https://petstore.octoperf.com/actions/Account.action?signonForm="
    And user enters Email as "j2ee" and Password as "j2ee"
    And click on login
    Then Page title should be "JPetStore Demo"

@sanity #user defined name    
Scenario: Create New account
    When user click on logout link
    Then Page title should be "JPetStore Demo" 
    Then user click on signin  
    And click on Rigister Now
    Then user can view the Dashboad
    When user enters the details
    And click on save account information
    Then Page title should be "JPetStore Demo"
    And close browser

@regression
Scenario: Click on fish
      When user click on Fish
      Then user should found fish in page
      And close browser
      
@regression
Scenario: Click on dog
      When user click on Fish
      Then user should found fish in page
      Then user return to post login page
      Then user click on Dog
      Then user should found Dog word in page
      And close browser
      
      
      
      
      
      
      
      
      
      
      
      
            