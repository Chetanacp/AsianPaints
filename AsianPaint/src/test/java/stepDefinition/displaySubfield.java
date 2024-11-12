package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import elementrepository.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.WebDriverUtility;

public class displaySubfield {
	WebDriver driver=DriverFactory.getDriver();
	HomePage home_Page = new HomePage(driver);
	WebDriverUtility webDriverUtility =new WebDriverUtility();
	FileUtility fileUtility=new FileUtility();
	
	@Given("Browser is opened and URL is navigated")
	public void browser_should_be_launched_and_navigated_to_the_home_page() throws Exception {
		
		Assert.assertEquals(driver.getCurrentUrl(), fileUtility.getDataFromPropertiesFiles("url"));
	    Reporter.log("Browser should be launched and navigated to the home page.",true);
	}
	@When("the user hovers over the Ellipsis link")
	public void the_user_hovers_over_the_link() throws InterruptedException {
		 webDriverUtility.handlePopups(driver);
		webDriverUtility.mouseHover(driver, home_Page.getEllipsislink());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Then("subfeatures should be displayed")
	public void subfeatures_should_be_displayed() {
	   Reporter.log("subfeatures should be displayed");
	}
	@When("the user able to click on Wallpapers subfilds")
	public void the_user_able_to_click_on_wallpapers_subfilds() {
	    driver.findElement(By.partialLinkText("Wallpapers")).click();
	    Reporter.log("The user able to click on wallpapers subfilds",true);
	}

	@Then("display Wallpaper Collection page")
	public void display_wallpaper_collection_page() {
		Assert.assertTrue(home_Page.getText().isDisplayed());
		Reporter.log("Display Wallpaper Collection page",true);
	}


	@Then("browser should be closed")
	public void browser_should_be_closed() {
	 
	}

}
