package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import Base.BaseClass;

public class AddAndRemovePage extends BaseClass{

	By addButton = By.xpath("//*[@id='content']/div/button");
	By deleteButton = By.xpath("//*[@id=\"elements\"]/button");
	
	
	public void clickAddButton() {
		
		driver.findElement(addButton).click();
		
	}
	
	public void clickRemoveButton() {
		
		driver.findElement(deleteButton).click();
		
	}
	
	public boolean verifyDeleteButtonIsDisplayed() {
		
		try {
			
			return driver.findElement(deleteButton).isDisplayed();
			
		}catch (NoSuchElementException e) {
			
			return false;
			
		}
			
		
	}
	
   
	
	
}
