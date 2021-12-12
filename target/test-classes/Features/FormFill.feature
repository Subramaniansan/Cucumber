#Author: your.email@your.domain.com

Feature: Form filling

  
  Scenario: Tv Purchase by using two dim list
    Given user launches a application
    And user click signin
    And user click on create account
    When User enters the details by two dim list
    | sathish   | 1234567891 | sat12345  | sat12345  |
    | sarath    | 8564231563 | sar12345  | sar12345  |
    | saravanan | 4561238974 | saro12345 | saro12345 |
    And user clicks submit
    Then user verify the account is created

 
Scenario: Tv Purchase by using two dim map
    Given user launches a application
    And user click signin
    And user click on create account
    When User enters the details by two dim map
    | Name      | Phoneno    | Email               | Password   |
    | sathish   | 1234567891 | sat123@gmail.com    | sat12345   |
    | sarath    | 8564231563 | sar12345@gmail.com  | sar1234    |
    | saravanan | 4561238974 | saro12345@gmail.com | saro12345  |
    And user clicks submit
    Then user verify the account is created
 