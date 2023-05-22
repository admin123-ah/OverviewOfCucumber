Feature: Pet Store Order Submission

  Background:
    Given I am on the PetStore website
	
	@tag1
  Scenario Outline: Login with valid credentials and validate the login page
    Given I am on the login page
    When I enter "<username>" and "<password>"
    And I click the login button
    Then I should be on the home page
    And I should see my username "<username>"

    Examples:
      | username|password|
      | j2ee|j2ee|

	@tag2
  Scenario Outline: Submit an order for Fish and validate submission
    Given I am on the home page
   	And I logged in successfully with "<Username>" and "<Password>"
    When I add Fish with SKU "F1-SW-01" to the cart
    And I proceed to checkout
    And I continue to the next step
    And I confirm the order
    Then I should see a confirmation message for the order submission
    
    Examples:
|Username|Password|
|j2ee|j2ee|

	@tag3
  Scenario Outline: Submit an order for Birds and validate submission
    Given I am on the home page
    And I logged in successfully with "<Username>" and "<Password>"
    And I clicked on birds
    When I add Birds with SKU to the cart
    |AV-CB-01|
    And I proceed to checkout
    And I continue to the next step
    And I confirm the order
    Then I should see a confirmation message for the order submission
    
    Examples:
|Username|Password|
|j2ee|j2ee|