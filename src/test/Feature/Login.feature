@Regration
Feature: Login

  @Windows
  Scenario: Open wallet
    Given Operation System Windows
    And I have <browser>
    When I open wallet
    Then I get title: Apollo


