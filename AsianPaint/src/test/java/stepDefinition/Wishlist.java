package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import elementrepository.HomePage;
import elementrepository.WishlistClick;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.JavaScriptUtil;
import utilityClasses.WebDriverUtility;

public class Wishlist {
	WebDriver driver=DriverFactory.getDriver();
	HomePage home_Page = new HomePage(driver);
	WebDriverUtility webDriverUtility =new WebDriverUtility();
	WishlistClick like=new WishlistClick(driver);
	WebDriverUtility driverUtility=new WebDriverUtility();
	
	@When("the user able to click on Mechanized Tools & Spares")
	public void the_user_able_to_click_on_mechanized_tools_spares() {
	    like.getMechanizedtools().click();
	    Reporter.log("The user able to click on Mechanized Tools & Spares",true);
	}

	@Then("the display  Mechanized Tools & Spares page")
	public void the_display_mechanized_tools_spares_page() {
	    Assert.assertTrue(like.getMechanizedPage().isDisplayed());
	    Reporter.log("The display  Mechanized Tools & Spares page",true);
	}

	@Then("the click on Laser Distance Meter Lite")
	public void the_click_on_laser_distance_meter_lite() {
		like.getLaser().click();
	    Reporter.log("The user able to click on  Laser Distance Meter Lite",true);
	  
	}

	@Then("the display of the  Laser Distance Meter Lite")
	public void the_display_of_the_laser_distance_meter_lite() {
		//Laser Distance Meter Lite
		driverUtility.switchToTabOnTitle(driver, "Laser Distance Meter Lite");
		 Assert.assertTrue(like.getLaserPage().isDisplayed());
		    Reporter.log("The display of the  Laser Distance Meter Lite",true);
	}

	@Then("the user able to clike on like button")
	public void the_user_able_to_clike_on_like_button() {
		
		like.getWishlist().click();
	    Reporter.log("The user able to click on  Laser Distance Meter Lite",true);
	  
		
	}



}
