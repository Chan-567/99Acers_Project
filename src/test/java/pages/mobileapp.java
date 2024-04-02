package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mobileapp {
	WebDriver driver;

	public mobileapp(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()=\"For Buyers\"]") WebElement buyer;
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div/ul/li[3]/span")WebElement commer;
	@FindBy(xpath="//a[@class='pageComponent' and text()='Commercial property for sale in Hyderabad']") WebElement comHyd;
	@FindBy(xpath="//div[text()='Hyderabad One']") WebElement locHyd;
	
	public void Buyer() {
		buyer.click();
	}
	public void Commercial() {
		commer.click();
	}
	public void CommHyderabad() {
		String thisLink = comHyd.getAttribute("href");
		driver.navigate().to(thisLink);
	}
	public void Hyderabad() {
		locHyd.click();
	}
	
}
