package elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterColours{
	@FindBy(xpath = "//span[text()='Brown']")
	private WebElement brown;

	public WebElement getBrown() {
		return brown;
	}
	
	@FindBy(xpath= "//span[text()='Off Whites']")
	private WebElement offWhite;

	public WebElement getOffWhite() {
		return offWhite;
	}
	
	@FindBy(xpath="//span[text()='Pink']")
	private WebElement pink;

	public WebElement getPink() {
		return pink;
	}
	
	public FilterColours(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
