package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lib.selenium.WebDriverServiceImpl;

public class createLeadPage extends WebDriverServiceImpl {

	public createLeadPage() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(id = "createLeadForm_companyName")
	WebElement eleCompany;

	@FindBy(id = "createLeadForm_firstName")
	WebElement eleFirstName;
	
	@FindBy(id = "createLeadForm_lastName")
	WebElement eleLastName;
	
	@FindBy(className = "Create Lead")
	WebElement eleButton;
	

	public createLeadPage typeCompany(String Company) {
		type(eleCompany, Company);
		return this;
	}
	
	public createLeadPage typeFirst(String Fname) {
		type(eleFirstName, Fname);
		return this;
	}
	
	public createLeadPage typeLast(String Lname) {
		type(eleLastName, Lname);
		return this;
	}
	
	public ViewLead clickButton() {
		click(eleButton);
		return new ViewLead();
	}
	
	
	
	}



