package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Land {
	WebDriver driver;

	public Land(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()=\"For Buyers\"]") WebElement buyer;
	@FindBy(xpath="//span[text()=\"Land/Plot\"]") WebElement Land;
	@FindBy(xpath="//a[text()='Plots in Hyderabad']") WebElement plohyd;
	
	public void BuyLand() {
		buyer.click();
	}
	public void cLand() {
		Land.click();
	}
	public void PlotHyderabad() {
		String thisLink = plohyd.getAttribute("href");
		driver.navigate().to(thisLink);
	}
}
