package elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveP {
	
	public RemoveP(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id='checkPincode']")
	private WebElement pincode;

	public WebElement getPincode() {
		return pincode;
	}

	@FindBy(xpath = "//button[text()='CHECK']")
	private WebElement check;

	public WebElement getCheck() {
		return check;
	}

	@FindBy(xpath = "//button[contains(text(), 'Add to cart')]")
	private WebElement addToCart;

	public WebElement getAddToCart() {
		return addToCart;
	}

	@FindBy(xpath = "//img[@title='cart-button']")
	private WebElement cart;

	public WebElement getCart() {
		return cart;
	}

	@FindBy(xpath = "//a[contains(text(), 'Checkout')]")
	private WebElement checkout;

	public WebElement getCheckout() {
		return checkout;
	}

	@FindBy(xpath = "(//span[@class='product-delete deleteIco-cart']")
	private WebElement remove;

	public WebElement getRemove() {
		return remove;
	}

}
