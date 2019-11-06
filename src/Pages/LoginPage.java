package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import Base.BaseClass;

public class LoginPage extends BaseClass {

	By loginMessage = By.xpath("/html/body/div[2]/div/div/p");
	
	
	
	String successfulLoginMessage = "Congratulations! You must have the proper credentials.";
	
	
	public void attemptLogin(String userName, String password) {
		
		driver.get("http://"+userName+":"+password+"@the-internet.herokuapp.com");
		
	}
	
	public void verifyLoginSuccessful() {
		
		String text = driver.findElement(loginMessage).getText();
		
		Assert.assertEquals(text, successfulLoginMessage);
		
		
	}
	
	
}
