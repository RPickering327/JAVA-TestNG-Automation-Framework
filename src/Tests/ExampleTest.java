package Tests;
import org.testng.annotations.Test;
import Pages.Page;

public class ExampleTest extends Page {

  @Test
  public void searchForDogFood() {
	  
	  searchForItem("Dog food");
	  checkPrimeBox();
	  verifyTitleIs("Amazon.co.uk: Dog food - Prime Eligible");
	  
	  
  }
}
