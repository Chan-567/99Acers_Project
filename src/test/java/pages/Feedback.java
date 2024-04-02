//package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class Feedback {
//	WebDriver driver;
//
//	public Feedback(WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//	}
//	@FindBy(xpath="//a[text()=\"For Buyers\"]") WebElement buyer;
//	@FindBy(xpath="//a[text()=\"Property in Hyderabad\"]") WebElement PrinHyd;
//	@FindBy(xpath="//*[@id=\"side_widget_feedback\"]") WebElement buy1;
//	@FindBy(xpath="/html/body/div[1]/div/div/div[7]/div[2]/div[2]/div[2]/form/div[4]/span/input") WebElement send;
//	//@FindBy(xpath="//input[@type='button']") WebElement send;
//	
//	public void Home() {
//		buyer.click();
//	}
//	public void Hyderabad() {
////		PrinHyd.click();
//		String thisLink = PrinHyd.getAttribute("href");
//		driver.navigate().to(thisLink);
//	}
//	public void Feedback() {
//		buy1.click();
//	}
//	public void Send() {
//		send.click();
//	}
//}
