package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import elementrepository.FilterColours;
import elementrepository.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;

public class filterByColour {
	WebDriver driver=DriverFactory.getDriver();
	
	FilterColours filterColours=new FilterColours(driver);
	FileUtility fileUtility =new FileUtility();
	@When("the user selects the colour {int}")
	public void the_user_selects_the_colour_color(Integer rowNum) throws Exception {
	   
	   String data =fileUtility.getDataFromExcel("Sheet1",rowNum, 0);
	 switch(data) {
	 case "Brown":
		 filterColours.getBrown().click();
		 //Assert.assertTrue(filterColours.getBrown().isEnabled());
		 break;
	 
	case "Off White":
		 filterColours.getOffWhite().click();
		 Thread.sleep(2000);
		 break;
	case "Pink":
	 filterColours.getPink().click();
	 break;
	
}   
	 Reporter.log(data+"wallpaper color is displayed");
	   
	}

}
