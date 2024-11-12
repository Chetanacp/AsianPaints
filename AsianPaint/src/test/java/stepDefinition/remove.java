package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import elementrepository.DiyAddToCart;
import elementrepository.HomePage;
import elementrepository.RemoveP;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.WebDriverUtility;

public class remove {
	WebDriver driver=DriverFactory.getDriver();
	 HomePage home_Page = new HomePage(driver);
	 RemoveP removeP=new RemoveP(driver);
	 FileUtility fileUtility=new FileUtility();
	@When("the user is able to enter the pincode")
	public void the_user_is_able_to_enter_the_pincode() throws Exception {
	    WebDriverUtility driverUtility=new WebDriverUtility();
		driverUtility.switchToTabOnTitle(driver, "Laser Distance Meter Lite");
	   String pincode=fileUtility.getDataFromExcel("Pincode", 1,0);
	   System.out.println(pincode);
//	   removeP.getPincode().click();
	   removeP.getPincode().sendKeys(pincode);
	   Thread.sleep(2000);
	   Reporter.log("The user is able to enter the pincode",true);
	}

	@When("the user is able to click on Check link")
	public void the_user_is_able_to_click_on_check_link() {
	    removeP.getCheck().click();
	    Reporter.log("The user is able to click on Check link",true);
	}

	@When("the user is able to click on Add to cart button")
	public void the_user_is_able_to_click_on_add_to_cart_button() {
		removeP.getAddToCart().click();
	    Reporter.log("The user is able to click on Add to cart button",true);
	}

	@When("the user able to click on cart button")
	public void the_user_able_to_click_on_cart_button() {
		
		removeP.getCart().click();
	    Reporter.log("The user able to click on cart button",true);
	    WebDriverUtility driverUtility=new WebDriverUtility();
		driverUtility.switchToTabOnTitle(driver, "Measuring Tape 15m");
	}

	@When("the user is able to click on Checkout link")
	public void the_user_is_able_to_click_on_checkout_link() {
		removeP.getCheckout().click();
	    Reporter.log("The user able to click on cart button",true);
	}

	@When("the user is able to click on remove button")
	public void the_user_is_able_to_click_on_remove_button() {
		removeP.getRemove().click();
	    Reporter.log("The user able to click on cart button",true);
	}



}
