#Author: sudhananda496@gmail.com
Feature: Adcatinhotel Functionalies

  @TS1
  Scenario: Adactin Hotel page Functionlies
    Given Lunching Chrome Browser page
    When Enter the url page "https://adactinhotelapp.com/"
    Then Open the Adactin Hotel page

  @TS2
  Scenario: Adactin Hotel Functionalies
    Given Navigate To Adactin Hotel Login page
    When Enter username and password  "phanindra1234","123456"
    Then validate the login function

  @TS3
  Scenario: Adactin Details Functionalies
    Given Launched the hotel details page
    When Enter th Details adactin hotel
    Then Click on the search button

  @TS4
  Scenario: Welocme to Adactin groups of Hotels
    Given Navigate to Welocme to the group Hotel
    When click to the button adactin hotel
    Then click continue to the button

  @TS5
  Scenario: The booking Adactin hotels
    Given Launched the adactin hotel
    When Enter the Details Hotel
    Then Click on the book now
