package Tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.AddAndRemovePage;

public class AddAndRemoveTests extends AddAndRemovePage {
	
	@Test
	public void addRemoveButtonTest() {
		
		clickLinkByName("Add/Remove Elements");
		clickAddButton();
		Assert.assertEquals(verifyDeleteButtonIsDisplayed(), true);
		clickRemoveButton();
		Assert.assertEquals(verifyDeleteButtonIsDisplayed(), false);

	}
	
}
