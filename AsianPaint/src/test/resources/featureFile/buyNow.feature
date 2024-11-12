Feature: Buy Now


Background:
Given Browser is opened and URL is navigated	
When the user hovers over the Ellipsis link
And the user able to click on DIY Tools subfilds 
And the display Buy DIY Tools page

Scenario: To validate user is able to buy products.

And user clicks on add to cart button for Claw Hammer
Then Claw Hammer should be added to cart

Scenario: Validate that the user is able to add Dry tool product into the cart.
And User click on Measuring Tape 15m
And User enters pincode.
And user clicks on check.
And User clicks on buy now.
