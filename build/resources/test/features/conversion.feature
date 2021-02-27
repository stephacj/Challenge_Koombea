Feature: Dimensions mobile automation
  As a user
  I want to convert the dimensions that enter in the application mobile

  Scenario Outline: verify conversion of dimensions length, area and volume
    Given that Stephanie wants to convert the dimensions
    When she enters
      |<length> |<area>| <volume>|
    Then you should see the conversion in the mobile application

    Examples:
    |length| area       | volume|
    | 2 Cm | 1 Hect     |  8 lt |



