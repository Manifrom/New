package leaf.leads;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.Read.ReadExcel;
import lib.selenium.PreAndPost;
import pages.myHomePage;

public class CreateLead extends PreAndPost{
    
    
     
    public void createLead(String cName,String fName,String lName){
    
        new myHomePage().clickLeads()
        .createLeadPage()
        .typeCompany(cName)
        .typeFirst(fName)
        .typeLast(lName)
        .clickButton();
        
    }
    
        
}
