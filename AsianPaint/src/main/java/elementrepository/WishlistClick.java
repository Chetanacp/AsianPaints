package elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistClick {
@FindBy(xpath="(//a[contains(text(),'Mechanized tools and spares ')])[1]")
private WebElement mechanizedtools;



@FindBy(xpath="//img[@title='Trucare_Laser_Distance_meter_Lite_Image_1']")
private WebElement laser;


@FindBy(xpath="//span[@id='wishlist-opt']")
private WebElement wishlist;

public WebElement getMechanizedtools() {
	return mechanizedtools;
}

@FindBy(xpath="//h2[text()='Mechanized Tools & Spares']")
private WebElement MechanizedPage;

@FindBy(xpath="//h2[contains(text(),'Laser Distance Meter Lite')]")
private WebElement LaserPage;

public WebElement getLaser() {
	return laser;
}

public WebElement getWishlist() {
	return wishlist;
}


public WebElement getMechanizedPage() {
	return MechanizedPage;
}


public WebElement getLaserPage() {
	return LaserPage;
}


public WishlistClick(WebDriver driver) {
	PageFactory.initElements(driver, this);
}




}
