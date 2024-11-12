package elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(partialLinkText = "...")
	private WebElement ellipsislink;

	public WebElement getEllipsislink() {
		return ellipsislink;
	}

	
	@FindBy(xpath="//iframe[@class='__st_preview_frame_bpn']")
	private WebElement iframe;
	
	public WebElement getIframe() {
		return iframe;
	}
	
	@FindBy(name="notnow")
	private WebElement popUp;
	
	public WebElement getPopUp() {
		return popUp;
	}
	@FindBy(xpath="img[@title='close icon' and @height='26']")
	private WebElement closeButton;


	public WebElement getCloseButton() {
		return closeButton;
	}
	
	@FindBy(xpath="//img[@alt='mobile-home-decor-image']")
	private WebElement image;
	
	public WebElement getImage() {
		return image;
	}

@FindBy(xpath="//*[@id=\"collectionListing\"]/section/div[1]/h2")
private WebElement text;

	public WebElement getText() {
	return text;
}

	/**
	 * @param ellipsislink
	 */
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}



	

	
}