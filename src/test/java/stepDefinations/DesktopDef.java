package stepDefinations;

import PageObjectpackage.DesktopPageObject;
import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DesktopDef extends Base {
	
	DesktopPageObject desktop = new DesktopPageObject();
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		openBrowser();
		logger.info("user is on retail website");
	}

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktop.clickOnDesktop();
		logger.info("user clicked on desktop tab");
		 
	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
	   desktop.clickOnShowAllDesktop();
	   logger.info("user clicked on show all desktops");
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		desktop.verifyAllItems();
		logger.info("user see all items");
	}

}
