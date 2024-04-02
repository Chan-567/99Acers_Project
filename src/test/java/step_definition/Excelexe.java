package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
public class Excelexe
{
	 WebDriver driver; 
	@Test(dataProvider = "EMI")
	public  void TestExcel(String tenure1)
	{
	driver	 = new ChromeDriver();
	driver.get("https://www.99acres.com/");
	driver.manage().window().maximize();
	WebElement buyer = driver.findElement(By.xpath("//a[text()=\"For Buyers\"]"));
	buyer.click();
//	WebElement insight = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div/ul/li[4]/span"));
//	insight.click();
//	WebElement loans = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div/ul/li[4]/div[2]/ul/li/div/ul/li[5]/a"));
//	String thisLink = loans.getAttribute("href");
//	driver.navigate().to(thisLink);
	driver.get("https://www.99acres.com/apply-for-home-loan-hlpg");
	WebElement EMI = driver.findElement(By.xpath("//div[text()='CALCULATE EMI']"));
	EMI.click();
	WebElement tenure = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[2]/div[2]/input"));
	tenure.sendKeys(Keys.CONTROL,"a");
	tenure.sendKeys(Keys.DELETE);
	tenure.sendKeys(tenure1);
//	WebElement rate = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div/div[2]/form/div[3]/input"));
//	rate.sendKeys(interest);
	}
	@DataProvider(name = "EMI")
	public Object getData() {
		Excel utils = new Excel("./src/test/resources/Acres.xlsx");
		int rows = utils.getRowCount(0);
		Object[][] logindata = new Object[rows][1];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < 1; j++) {
				logindata[i][j] = utils.getdata(0, i + 1, j);
				System.out.println(logindata[i][j]);
			}
 
		}
		return logindata;
	}
	
	
}

