Feature: Dimensions mobile automation
  As a user
  I want to convert the dimensions that enter in the application mobile

  Scenario: verify conversion of dimensions length, area and volume
    Given that Stephanie wants to convert the dimensions
    When she enters
    Then you should see the conversion in the mobile application

 # | Examples:
   # | operation| value |
   # |length    |    9  |
    #|area      | 7     |
    #|volume    | 8     |