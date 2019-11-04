package Pages;
import org.openqa.selenium.By;

import Base.BaseClass;

public class Page extends BaseClass{

	By searchBar = By.id("twotabsearchtextbox");
	By primeCheckBox = By.xpath("//*[@id=\"p_76/419158031\"]/span/a/div/label/i");
	
	
	public void searchForItem(String item) {
		
		driver.findElement(searchBar).sendKeys(item);
		driver.findElement(searchBar).submit();
		
	}
	
	public void checkPrimeBox() {
		driver.findElement(primeCheckBox).click();
	}
	
	
	
}
