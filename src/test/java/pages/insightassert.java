package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class insightassert {
	WebDriver driver;

	public insightassert(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[text()=\"For Buyers\"]") WebElement buyer;
//	@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div/ul/li[4]/span")WebElement insights;
//	@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div/ul/li[4]/div[2]/ul/li/div/ul/li[1]/a") WebElement locality;
//	//@FindBy(xpath="//a[text()='Localities in Hyderabad']") WebElement locHyd;
//	@FindBy(xpath="//h1[text()='Locality Insights']") WebElement locins;
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div/ul/li[3]/span")WebElement commer;
	@FindBy(xpath="//a[@class='pageComponent' and text()='Commercial property for sale in Hyderabad']") WebElement comHyd;
	@FindBy(xpath="//h1[text()='Commercial Property in Hyderabad for Sale']") WebElement commercial;
	
	
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
	public void comass() {
		String value = commercial.getText();
		SoftAssert as = new SoftAssert();
	    as.assertEquals(value,"Commercial Property in Hyderabad for Sale");
	    System.out.println(value);
	}
	
	

}
