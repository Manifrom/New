package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lib.selenium.WebDriverServiceImpl;

public class myHomePage extends WebDriverServiceImpl{
	
	public myHomePage() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(linkText = "Leads")
	WebElement eleLead;


	public myLeadsPage clickLeads()
	{
		click(eleLead);
		return new myLeadsPage();
	}


}