package elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiyAddToCart {
	@FindBy(partialLinkText = "DIY tools")
	private WebElement diyTools;

	public WebElement getDiyTools() {
		return diyTools;
	}

	@FindBy(xpath = "//h2[text()='Buy DIY Tools']")
	private WebElement buyDIYToolsPage;

	public WebElement getBuyDIYToolsPage() {
		return buyDIYToolsPage;
	}
	
	@FindBy(xpath ="//h3[contains(text(),'Claw Hammer')]/../..//button[text()='Add to Cart' ]")
	private WebElement addToCart;

	public WebElement getAddToCart() {
		return addToCart;
	}
@FindBy(xpath="//img[@title='cart-button']")
private WebElement cartPage;

	public WebElement getCartPage() {
	return cartPage;
}



	@FindBy(xpath="//p[text()='Claw Hammer']")
	private WebElement addClawHammer;
	
	
	public WebElement getAddClawHammer() {
		return addClawHammer;
	}

	
	
	////Buy product
	
	@FindBy(xpath="//input[@id='checkPincode']")
	private WebElement pin;
	
	public WebElement getPin() {
		return pin;
	}



	@FindBy(xpath="//img[@alt='9822ZV28122_1']")
	private WebElement measuringTape;
	
	public WebElement getMeasuringTape() {
		return measuringTape;
	}
	
	@FindBy(xpath="//button[text()='CHECK']")
	private WebElement check;
	

	public WebElement getCheck() {
		return check;
	}

	@FindBy(xpath="//a[@id='buy-now-click']")
	private WebElement buyNowClick;
	
	
	public WebElement getBuyNowClick() {
		return buyNowClick;
	}

	public DiyAddToCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


}
