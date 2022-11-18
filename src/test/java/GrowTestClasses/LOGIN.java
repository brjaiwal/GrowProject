package GrowTestClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import BaseClasess.BaseClass1;
import POMclassesGrow.LoginPageGrow;
import UtilClasses.Utilcass1;

public class LOGIN extends Utilcass1  {
	
WebDriver driver;
LoginPageGrow LG;
	
	@BeforeClass
	@Parameters("browser")
	
	public void BeforClass (String browser) {
		driver = BaseClass1.GEtBroweser(browser);
		}
	@BeforeMethod
	public void BeforMethod() {
		LG = new LoginPageGrow(driver);
		
	}
	@Test
	
	public void LoginPage() {
		LG.ClickForLogin();
		LG.EnterEmailID();
		LG.ClickOnContinuebtn();
		LG.EnterPassword();
		LG.ClickOnSubmitbtn();
		
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method called");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("Login Successfull ant test is passed");
	}
	
	
	
	
	
	
	

}
