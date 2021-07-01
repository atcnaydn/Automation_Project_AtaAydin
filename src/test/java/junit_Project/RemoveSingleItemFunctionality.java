package junit_Project;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.TestPage;
import util.BrowserFactory;

public class RemoveSingleItemFunctionality {

	WebDriver driver;
	TestPage testPage;

	@Test
	public void RemoveSingleItem() {

		driver = BrowserFactory.init();

		testPage = PageFactory.initElements(driver, TestPage.class);
		testPage.selectRandomList();

		testPage.clickRemoveButton();
		testPage.validateListDeleted();

	}

	@After
	public void teardown() {
		BrowserFactory.teardown();
	}

}
