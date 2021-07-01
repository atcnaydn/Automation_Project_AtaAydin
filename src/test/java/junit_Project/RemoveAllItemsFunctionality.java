package junit_Project;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.TestPage;
import util.BrowserFactory;

public class RemoveAllItemsFunctionality {

	WebDriver driver;
	TestPage testPage;
	
	@Test
	public void removeAllItems() {
		
		driver = BrowserFactory.init();
		testPage = PageFactory.initElements(driver, TestPage.class);
		
		testPage.clickToggleAllButton();
		testPage.clickRemoveButton();
		testPage.validateAllListsDeleted();
		
	}
	
	@After
	public void teardown() {
		BrowserFactory.teardown();
	}
}
