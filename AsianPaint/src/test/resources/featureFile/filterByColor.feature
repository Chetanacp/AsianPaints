Feature: Select Color

Scenario Outline: Display wallpapers based on selected colour.

Given Browser is opened and URL is navigated	
When the user hovers over the Ellipsis link
And the user able to click on Wallpapers subfilds 
Then display Wallpaper Collection page
When the user selects the colour <Colours>


Examples:
						| Colours |
						|    1		|
						|	   2		|
						|		 3		|


