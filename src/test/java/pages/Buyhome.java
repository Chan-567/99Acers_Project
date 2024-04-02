package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Buyhome {
	WebDriver driver;

	public Buyhome(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()=\"For Buyers\"]") WebElement buyer;
	@FindBy(xpath="//a[text()=\"Property in Hyderabad\"]") WebElement PrinHyd;
	@FindBy(xpath="//div[@ data-label='UNDER_CONSTRUCTION_NUDGE']") WebElement UConst;
	
	public void Home() {
		buyer.click();
	}
	public void Hyderabad() {
//		PrinHyd.click();
		String thisLink = PrinHyd.getAttribute("href");
		driver.navigate().to(thisLink);
	}
	public void Construction() {
		UConst.click();
	}

}
