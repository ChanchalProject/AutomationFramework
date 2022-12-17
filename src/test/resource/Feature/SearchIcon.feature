Feature: Check Search Icon functionality and add PDP product in mini basket

Background:
When User launch site URL
And select allow all from cookies and select over 18 age confirmation option
And user login into the application with valid "username" and "password"


@tag1
Scenario: Check to ensure PLP product add in mini basket
When click on search icon and type 'searchkeyword' 
And get all list from page
And click on first result
Then click add to cart button
Then confirm mini-basket displayed count of "1"

@tag2
Scenario: Check PDP product add in mini basket
When click on search icon and type "searchkeyword"
And product list is open and click on link of first product
Then click on add to basket button

