Feature: View Basket and Add Product Functionality

Background:
When User launch site URL
And select allow all from cookies and select over 18 age confirmation option
And user login into the application with valid "username" and "password"

Scenario: Basket Test
When After Login Ensure Basket Icon is Displayed
And Click On Basket Icon and Ensure Basket is Empty
Then Items Remove from Basket
