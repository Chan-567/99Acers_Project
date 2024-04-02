Feature: buy a home
  I want to use this template for my feature file

  Scenario: For buying a home
    Given after successful login into the 99Acres website
    When user selects the for buyer option on website it shows a dropdown
    And select the property in hyderabad option and clicks unnder construction option
    Then select the divine space 2BHK flat

  Scenario: To buy a Plot
    Given after successful login into the 99Acres website
    When user selects buyer option then click on Plot and click on East facing option
    And select one Plot
    Then view the review page
  
  Scenario: To buy a commercial property
    Given after successful login into the 99Acres website
    When user selects buyer option then clicks on commercial sale in Hyderabad
    And clicks on Post property
    Then it should clicks dropdown button and display required
    
  #Scenario: Feedback
  #	Given after successful login into the 99Acres website
  #	When user selects buyer option then clicks on buy a home in Hyderabad
  #	And clicks on Feedback
  #	Then clicks on send option
  	
  #Scenario: Radiobutton click
  #	Given after successful login into the 99Acres website
  #	When user selects buyer option then clicks on commercial sale in hyderabad
  #	And clicks on Hyderabad one link and clicks on phone number
  #	Then clicks on radio button Owns a business
  #	And refresh the page
  
  #Scenario: Calculate EMI
  #	Given after successful login into the 99Acres website
  #	When user selects buyer option then clicks on insights 
  #	And click on Home loans option
  #	Then clicks on calculate EMI 
  
  Scenario: Insights assertion
  	Given after successful login into the 99Acres website
  	When user selects buyer option then clicks on insights
  	And clicks on locality insights
  	Then display whether chosen city is selected or not
  	
  Scenario: Mobile App 
  	Given after successful login into the 99Acres website
  	When user selects buyer option then clicks on commercial
  	And clicks on first link 
  	Then clicks on mobile app option

  