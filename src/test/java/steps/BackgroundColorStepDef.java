package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.TestPage;
import util.BrowserFactory;

public class BackgroundColorStepDef {
	
	WebDriver driver;
	TestPage testPage;

	@Given("^\"([^\"]*)\" button exists$")
	public void button_exists(String color) {
		
		driver = BrowserFactory.init();
		testPage = PageFactory.initElements(driver, TestPage.class);
		
		if(color=="skyblue") {
			testPage.assertColorButtonExistance(color);
			} else if (color=="white") {
			testPage.assertColorButtonExistance(color);
			}
		
		
	}
	
	@When("^User clicks on the skyblue button$")
	public void user_clicks_on_the_skyblue_button() {

			testPage.clickBlueBackgroundButton();
	}
	
	@When("^User clicks on the white button$")
	public void user_clicks_on_the_white_button() {
		
		testPage.clickWhiteBackgroundButton();
	}
	
	@Then("^Background will change to \"([^\"]*)\"$")
	public void background_will_change_to_sky_blue(String color) {
		
		testPage.verifyBackgroundColor(color);
		
		BrowserFactory.teardown();
		
	}
	
	
	
	
}
