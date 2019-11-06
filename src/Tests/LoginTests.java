package Tests;

import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginTests extends LoginPage{
	
	@Test
	public void sucessfulLogin() {

		attemptLogin("admin", "admin");
		clickLinkByName("Basic Auth");
		verifyLoginSuccessful();
		
		
	}
	
}
