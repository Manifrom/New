package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lib.selenium.WebDriverServiceImpl;

public class myLeadsPage extends WebDriverServiceImpl {

	public myLeadsPage() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(linkText = "Create Lead")
	WebElement eleCreate;

	public createLeadPage createLeadPage() {
		click(eleCreate);
		return new createLeadPage();
	}

}

