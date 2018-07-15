package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lib.selenium.WebDriverServiceImpl;

public class ViewLead extends WebDriverServiceImpl {

	public ViewLead() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(id = "viewLead_firstName_sp")
	WebElement eleFname;

	public void verifyName(String fname) {
		verifyExactAttribute(eleFname, "value", fname);
	}

}

