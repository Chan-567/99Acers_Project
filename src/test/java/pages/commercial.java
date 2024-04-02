package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class commercial {
	WebDriver driver;


	public commercial(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath="//a[text()=\"For Buyers\"]") WebElement buyer;
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div/ul/li[3]/span")WebElement commer;
	@FindBy(xpath="//a[@class='pageComponent' and text()='Commercial property for sale in Hyderabad']") WebElement comHyd;
	@FindBy(xpath="//span[text()='Pre Leased']") WebElement lease;
	@FindBy(xpath="//span[text()='Owner']") WebElement owner;
	
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
	public void PreLease() {
		lease.click();
	}
	public void Owner() {
		owner.click();
	}
	
}
