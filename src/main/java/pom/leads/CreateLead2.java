package pom.leads;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.Read.ReadExcel;
import lib.selenium.PreAndPost;
import pages.myHomePage;

public class CreateLead2 extends PreAndPost{


	@BeforeTest
	public void setValues() {
		testCaseName="CreateLead";
		testDesc="Creating a New Lead";
		nodeName="Lead";
		author="Mani";
		category="Sanity";
		excelFileName="CreateLead";

	}

	@Test(dataProvider="Create")
	public void createLead(String cName,String fName,String lName){	
		
		new myHomePage().clickLeads()
		.createLeadPage()
		.typeCompany(cName)
		.typeFirst(fName)
		.typeLast(lName)
		.clickButton()
		.verifyName(fName);
		
		
		
	}
	/*	@DataProvider(name="UAT")
	public Object[][] getData1() {
		Object[][] data = new Object[1][5];
		data[0][0] = "Cg";
		data[0][1] = "arun";
		data[0][2] = "f";
		data[0][3] = "arun@CG.com";
		data[0][4] = 1234567890;
		return data;

	}*/

	









	/*
		String[][] data = new String[2][5];
		data[0][0] = "TestLeaf";
		data[0][1] = "sarath";
		data[0][2] = "M";
		data[0][3] = "Sarath@testLeaf.com";
		data[0][4] = "1234567890";
	 */

}








