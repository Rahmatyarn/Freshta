package PageObjectpackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.UtilityClasses;

public class DesktopPageObject extends Base {

	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktop;

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktop;

	@FindBy(xpath = "//div[@id='product-category']")
	private WebElement itemsArePresent;

	public void clickOnDesktop() {
		desktop.click();
	}

	public void clickOnShowAllDesktop() {
		showAllDesktop.click();

	}

	public void verifyAllItems() {
		UtilityClasses.takeScreenShot();

	}

}
