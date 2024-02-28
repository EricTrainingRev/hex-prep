# Features are high level descriptions of some feature or aspect of your application that has potentially multiple
# avenues of interaction
Feature: Users who speak and read different languages should be able to access the landing page of Wikipedia they can understand

  # Scenarios are individual avenues of exploration that play out specific instances of the feature listed above
  Scenario: As an English user I should be able to navigate to the English landing page
    # The Given keyword is used to indicate the starting condition for the scenario
    Given   The User is on the main Wikipedia navigation page
    # The When keyword is used to indicate actions taken by the user
    When    The English User clicks on the English link
    # The Then keyword is used to indicate what the ending result/s of the scenario should be
    Then    The English User should be redirected to the English landing page

  Scenario: As a Spanish user I should be able to navigate to the Spanish landing page

    Given   The User is on the main Wikipedia navigation page
    When    The Spanish User clicks on the Spanish link
    Then    The Spanish User should be redirected to the Spanish landing page