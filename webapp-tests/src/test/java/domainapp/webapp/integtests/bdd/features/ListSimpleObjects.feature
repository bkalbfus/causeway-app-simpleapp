#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#@tag
Feature: List Simple Objects
  tests that listing SimpleObjects is accurate

  @main
  Scenario: Ten arbitrary objects
    Given There are 10 SimpleObjects
    #And some other precondition
    When I List them
    #And some other action
    #And yet another action
    Then I count 10 SimpleObjects
    #And check more outcomes

  @main
  Scenario: Really Simple
    Given I have a dog
    When I name my dog "Ben"
    Then my dog's name is "Ben"

#  @tag2
#  Scenario Outline: Title of your scenario outline
#    Given I want to write a step with <name>
#    When I check for the <value> in step
#    Then I verify the <status> in step
#
#    Examples: 
#      | name  | value | status  |
#      | name1 |     5 | success |
#      | name2 |     7 | Fail    |
