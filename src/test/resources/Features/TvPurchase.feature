#Author: subramaniansanjay.email@your.domain.com
@tv
Feature: Television

Background:
  Given User launches application

  Scenario: Tv Purchase
    When User search tv
    And User click on tv name
    Then User click on Buy now
    
   
  Scenario: Tv Purchase by using one dim list
    When User search tv by one dim list
     |Samsung 108 cm|Mi 80 cm|LG 80 cm|
    And User click on tv name
    Then User click on Buy now
    
  Scenario: Tv Purchase by using one dim map
    When User search tv by one dim map
    | 1 | Samsung 108 cm |
    | 2 | Mi 80 cm |
    | 3 | LG 80 cm |
    And User click on tv name
    Then User click on Buy now
    
  # Scenario Outline: Tv Purchase by outline
   # Given User launches application
    #When User search tv "<Tv Name>"
   # And User click on tv name
    #Then User click on Buy now
   
  # Examples:
 
     | Tv Name |
    | Samsung 108 cm |
     | Mi 80 cm |
     | LG 80 cm |
    