Feature: Google Search

  Scenario: Search for Cucumber in Google
    Given user is on login page
    When user enters username as "username" and password as "password"
    Then user clicks submit button
    Then user clicks "Log out" button
    Then user verifies logged out alert

  Scenario Outline: Add New Customer
    Given user is on login page
    When user enters username as "username" and password as "password"
    Then user clicks submit button
    Then user lands on home page
    Then user navigates to Add customer page
#    Then user enters customer name as "<Customer_Name>"
#    Then user enters gender as "<Gender>"
#    Then user enters Date of birth as "<DOB>"
#    Then user enters Address as "<Address>"
#    Then user enters City as "<City>"
#    Then user enters State as "<State>"
#    Then user enters PIN as "<PIN>"
#    Then user enters Mobile Number as "<MobileNumber>"
#    Then user enters email as "<Email>"
#    Then user enters password as "<Password>"
#    Then user clicks add customer submit button

    Examples:
      | Customer_Name | Gender | DOB        | Address | City   | State | PIN    | MobileNumber | Email                 | Password   |
      | Venkat        | Female | 17-09-1994 | 1/111-A | Sangai | TN    | 605801 | 7639677127   | venkatcse42@gmail.com | Number@123 |


