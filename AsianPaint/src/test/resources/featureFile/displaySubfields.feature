Feature: Asian Paints

#Scenario: Validate that the user is able to hover on the Ellipsis link.
Scenario: Validate that the user can click on the Wallpapers link
Given Browser is opened and URL is navigated	
When the user hovers over the Ellipsis link
Then subfeatures should be displayed
And the user able to click on Wallpapers subfilds 
Then display Wallpaper Collection page
And browser should be closed

