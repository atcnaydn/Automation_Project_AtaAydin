package testNG_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import page.TestPage_TestNG;
import util.BrowserFactory;

public class DuplicateCategoryFunctionality {

	WebDriver driver;
	TestPage_TestNG testPageNG;

	@Test
	public void DuplicateCategoryTest() {
		driver = BrowserFactory.init();
		testPageNG = PageFactory.initElements(driver, TestPage_TestNG.class);
		
		testPageNG.createDuplicateClass("TestCategory");
		testPageNG.validateDuplicateNotCreated();
		
	}
	
	@AfterMethod
	public void teardown() {
		BrowserFactory.teardown();
	}
		
	}