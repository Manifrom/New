package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class createLead {
	 ChromeDriver driver;

	@Given("Open the browser")
	public void Openbrowser(){
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	      driver = new ChromeDriver();     
		
	}
	@And("Launch url")
	public void Launchurl() {
		driver.get("http://leaftaps.com/opentaps/control/main");
		
	}
	@And("Set the timeout")
	public void Settimeout() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	@And("maximize the browser")
	public void MaxBrowser() {
		driver.manage().window().maximize();
        
		
	}
	@And("Enter the credentials (.*) and (.*)")
	public void Credential(String un , String pwd) {
		driver.findElementById("username").sendKeys(un);
		driver.findElementById("password").sendKeys(pwd);
		
	}
	@And("Click on the login button")
	public void loginbtn()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@And("Click crmsfa")
	public void Clckcrmsfa() {
		driver.findElementByLinkText("CRM/SFA").click();
		
	}
	
	@And("click createlead")
	public void createlead() {
		driver.findElementByLinkText("Create Lead").click();
		
	}
	
	@And("Enter mandatoryfields (.*) and (.*) and (.*)")
	public void fields(String comp, String fName, String lName) {
		
		driver.findElementById("createLeadForm_companyName").sendKeys(comp);
		
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys(fName);
		
		driver.findElementByXPath("(//input[@name='lastName'])[3]").sendKeys(lName);
		
		driver.findElementByClassName("smallSubmit").click();
	}
	@Then("Login should success")
	public  void success() {
		System.out.println("Login success");
		driver.close();	
		}	
	
}


