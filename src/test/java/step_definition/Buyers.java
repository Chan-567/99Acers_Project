package step_definition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;
import pages.Buyhome;
//import pages.Feedback;
import pages.Land;
import pages.commercial;
import pages.insightassert;
import pages.mobileapp;
//import pages.commercial1;

public class Buyers {
	WebDriver driver = new ChromeDriver();
	Buyhome h = new Buyhome(driver);
	commercial c = new commercial(driver);
	insightassert ii = new insightassert(driver);
	//Feedback f = new Feedback(driver);
	Land l = new Land(driver);
	mobileapp m = new mobileapp(driver);

	@Given("after successful login into the 99Acres website")
	public void after_successful_login_into_the_99acres_website() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		 driver.navigate().to("https://www.99acres.com/");
		 driver.manage().window().maximize();
	}

	@When("user selects the for buyer option on website it shows a dropdown")
	public void user_selects_the_for_buyer_option_on_website_it_shows_a_dropdown() {
		// Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.xpath("//a[text()=\"For Buyers\"]")).click();
//		Buyhome h = new Buyhome(driver);
		h.Home();
	}

	@When("select the property in hyderabad option and clicks unnder construction option")
	public void select_the_property_in_hyderabad_option_and_clicks_unnder_construction_option() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		//WebElement x = driver.findElement(By.xpath("//a[text()=\"Property in Hyderabad\"]"));
//		String thisLink = x.getAttribute("href");
//		driver.navigate().to(thisLink);
//		Buyhome h = new Buyhome(driver);
		h.Hyderabad();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("/html/body/div[1]/div/div/div[5]/div[3]/div[1]/div[3]/div[1]/div/div/div/div/div/div[4]")).click();
		//driver.findElement(By.xpath("//div[@ data-label='UNDER_CONSTRUCTION_NUDGE']")).click();
		
	
		h.Construction();
		

	}

	@Then("select the divine space 2BHK flat")
	public void select_the_divine_space_2bhk_flat() throws AWTException, InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		JavascriptExecutor javascriptExecutor  = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,800)");
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("var element = document.elementFromPoint(100, 100);"
//                        + "var event = new MouseEvent('dblclick', { 'view': window, 'bubbles': true, 'cancelable': true });"
//                        + "element.dispatchEvent(event);");
//		Actions actions = new Actions(driver);
//		actions.moveByOffset(100, 100).doubleClick().perform();
        Robot robot = new Robot();
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(100); // Delay between clicks
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(3000);
        driver.quit();
	}
	

	@When("user selects buyer option then click on Plot and click on East facing option")
	public void user_selects_buyer_option_then_click_on_land_plot_and_click_on_east_facing_option() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.xpath("//a[text()=\"For Buyers\"]")).click();
		
		l.BuyLand();
		//driver.findElement(By.xpath("//span[text()=\"Land/Plot\"]")).click();
		
		l.cLand();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		WebElement x = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div/ul/li[2]/div/ul/li/div/ul/li[4]/a"));
//		String thisLink = x.getAttribute("href");
//		driver.navigate().to(thisLink);
	
		l.PlotHyderabad();
		
	}

	@When("select one Plot")
	public void select_one_plot() throws AWTException, InterruptedException {
		JavascriptExecutor javascriptExecutor  = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,800)");
        Robot robot = new Robot();
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(100); // Delay between clicks
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        }

	@Then("view the review page")
	public void view_the_review_page() throws AWTException, InterruptedException {
		// Write code here that turns the phrase above into concrete actions
//		JavascriptExecutor javascriptExecutor1  = (JavascriptExecutor) driver;
//        javascriptExecutor1.executeScript("window.scrollBy(0,1000)");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        Thread.sleep(3000);
        driver.quit();

	}


	@When("user selects buyer option then clicks on commercial sale in Hyderabad")
	public void user_selects_buyer_option_then_clicks_on_commercial_sale_in_hyderabad() {
		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
		//driver.findElement(By.xpath("//a[text()=\"For Buyers\"]")).click();
		
		c.Buyer();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div/ul/li[3]/span")).click();
		
		c.Commercial();
//		WebElement x = driver.findElement(By.xpath("//a[@class='pageComponent' and text()='Commercial property for sale in Hyderabad']"));
//		String thisLink = x.getAttribute("href");
//		driver.navigate().to(thisLink);
		
		c.CommHyderabad();
		
	}
	

	@When("clicks on Post property")
	public void clicks_on_post_property() throws InterruptedException {
		//driver.findElement(By.xpath("/html/body/div[1]/div/div/div[5]/div[3]/div[1]/div[3]/div[1]/div/div/div/div[1]/div/div[2]/span[2]")).click();
		
		c.PreLease();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/div[1]/div/div/div[5]/div[3]/div[1]/div[3]/div[1]/div/div/div/div[1]/div/div[3]")).click();
		
		c.Owner();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.quit();
	}
	
	@Then("it should clicks dropdown button and display required")
	public void it_should_display_details_screen() {
		// Write code here that turns the phrase above into concrete actions
	}
	
//	@When("user selects buyer option then clicks on buy a home in Hyderabad")
//	public void user_selects_buyer_option_then_clicks_on_buy_a_home_in_hyderabad() {
//	    // Write code here that turns the phrase above into concrete actions
//	    f.Home();
//	    f.Hyderabad();
//	}
//
//	@When("clicks on Feedback")
//	public void clicks_on_feedback() throws InterruptedException {
//	    // Write code here that turns the phrase above into concrete actions
//	    f.Feedback();
//	    Thread.sleep(3000);
//	    f.Send();
//	    driver.quit();
//	}
	@When("user selects buyer option then clicks on insights")
	public void user_selects_buyer_option_then_clicks_on_insights() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    ii.Buyer();
	    Thread.sleep(3000);
	    ii.Commercial();
	    Thread.sleep(2000);
	    ii.CommHyderabad();
		Thread.sleep(2000);
	}
	@When("clicks on locality insights")
	public void clicks_on_locality_insights() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		ii.comass();
		Thread.sleep(3000);
		driver.quit();
		
	}
	@Then("display whether chosen city is selected or not")
	public void display_whether_chosen_city_is_selected_or_not() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("user selects buyer option then clicks on commercial")
	public void user_selects_buyer_option_then_clicks_on_commercial() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		m.Buyer();
		m.Commercial();
		m.CommHyderabad();
		Thread.sleep(3000);
	}
	@When("clicks on first link")
	public void clicks_on_first_link() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		m.Hyderabad();
		Thread.sleep(2000);
	}
	@Then("clicks on mobile app option")
	public void clicks_on_mobile_app_option() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		  driver.navigate().back();
		  driver.quit();
	}

}
