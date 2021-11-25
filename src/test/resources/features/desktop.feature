Feature: Desktops

Background: 
Given User is on Retail website
When User click on Desktops tab
And User click on Show all desktops

@desktop
Scenario: User verify all items are present in Desktops tab
Then User should see all items are present in Desktop page



