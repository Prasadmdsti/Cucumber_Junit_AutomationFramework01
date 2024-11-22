Feature: Login

@sanity #user defined name
Scenario: Sucessful Loginwith valid Credentials
      Given user launch chrome browser
      When user opens URL "https://petstore.octoperf.com/actions/Account.action?signonForm="
      And user enters Email as "j2ee" and Password as "j2ee"
      And click on login
      Then Page title should be "JPetStore Demo"
      When user click on logout link
      Then Page title should be "JPetStore Demo"
      And close browser
      
@regression     
Scenario Outline: Login Data Driven
      Given user launch chrome browser
      When user opens URL "https://petstore.octoperf.com/actions/Account.action?signonForm="
      And user enters Email as "<email>" and Password as "<password>"
      And click on login
      Then Page title should be "JPetStore Demo"
      When user click on logout link
      Then Page title should be "JPetStore Demo"
      And close browser
      
      Examples:
           | email | password |
           | j2ee | j2ee |
           | j2ee | j2eee |  #invalid credentials