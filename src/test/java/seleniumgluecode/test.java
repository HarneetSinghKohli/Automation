package seleniumgluecode;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class test {
	WebDriver driver;
	String pageUrl="http://the-internet.herokuapp.com/";
	
	
	
	@Given("^i want to  open a URL$")
	public void i_want_to_open_a_URL() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C://Users//hkohli//OneDrive - Sopra Steria//Data//Software//ChromeDriver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to(pageUrl);
		driver.manage().timeouts().implicitlyWait(1000000, TimeUnit.SECONDS);
	}

	@When("^i open URL$")
	public void i_open_URL() throws Throwable {
		
	}

	@Then("^page open$")
	public void page_open() throws Throwable {
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, pageUrl);
	}
	
	@Then("page close")
	public void page_close() {
	   
		  driver.close();
		  driver.quit();
	 
	}
}
