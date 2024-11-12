package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import elementrepository.DiyAddToCart;
import elementrepository.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.WebDriverUtility;

public class addToCart {
	WebDriver driver=DriverFactory.getDriver();
	 HomePage home_Page = new HomePage(driver);
	 DiyAddToCart diyAddToCart=new DiyAddToCart(driver);
	 FileUtility fileUtility=new FileUtility();
	 @When("the user able to click on DIY Tools subfilds")
	public void the_user_able_to_click_on_diy_tools_subfilds() {
	    diyAddToCart.getDiyTools().click();
	    Reporter.log("the user able to click on DIY Tools subfilds",true);
	}

	@When("the display Buy DIY Tools page")
	public void the_display_buy_diy_tools_page() {
	    Assert.assertTrue(diyAddToCart.getBuyDIYToolsPage().isDisplayed());
	}

	@When("user clicks on add to cart button for Claw Hammer")
	public void user_clicks_on_add_to_cart_button_for_claw_hammer() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000);");
		Thread.sleep(4000);
		
		 diyAddToCart.getAddToCart().click();
	}
	@Then("Claw Hammer should be added to cart")
	public void claw_hammer_should_be_added_to_cart() {
		diyAddToCart.getCartPage().click();
		Assert.assertTrue(diyAddToCart.getAddClawHammer().isDisplayed());
		 Reporter.log("product added successfully to cart",true);
	}

	
	//buy products
	
	@When("User click on Measuring Tape 15m")
	public void user_click_on_measuring_tape_15m() {
	    diyAddToCart.getMeasuringTape().click();
	}

	@When("User enters pincode.")
	public void user_enters_pincode() throws Exception {
		WebDriverUtility driverUtility=new WebDriverUtility();
		driverUtility.switchToTabOnTitle(driver, "Measuring Tape 15m");
	   String pincode=fileUtility.getDataFromExcel("Sheet1", 1,2);
	   System.out.println(pincode);
	   diyAddToCart.getPin().sendKeys(pincode);
	   Thread.sleep(2000);
	}
	
//	@When("User enters <pincode>.")
//	public void user_enters_pincode() {
//	    
//	}



	@When("user clicks on check.")
	public void user_clicks_on_check() {
		diyAddToCart.getCheck().click();
		Reporter.log("the user clicks on check link",true);
	}

	@When("User clicks on buy now.")
	public void user_clicks_on_buy_now() throws InterruptedException {
		Thread.sleep(2000);
		diyAddToCart.getBuyNowClick().click();
		
		Reporter.log("the user clicks on buy now link",true);
		
	}

}




