@UI @Run
Feature: Add new user 2

  Scenario Outline: Add new user to our website
    Given User navigates to the website1 homepage
    When User click on register button
    And User inserts some of mandatory fields1
    And User give <userName>
    Examples:
    |userName|
    |Gadher|
    |Johny |

