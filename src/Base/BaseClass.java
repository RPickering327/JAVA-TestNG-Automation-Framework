package Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	public WebDriver driver; 
	private String baseUrl = "https://www.amazon.co.uk/";
	
	@BeforeTest
	public void driverSetup() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get(baseUrl);
		
	}
	
	
	@AfterTest
	public void driverCleanUp() {
		
	 driver.quit();
		
	}
	
	
	public void verifyTitleIs(String input) {
		
		Assert.assertEquals(driver.getTitle(), input);
		
	}
	
	
}
