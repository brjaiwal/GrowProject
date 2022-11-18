package GrowTestClasses;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseClasess.BaseClass1;
import POMclassesGrow.AddToCart;
import POMclassesGrow.EditSIPDate;
import UtilClasses.Utilcass1;


public class FundAddToCart  extends Utilcass1 {
	WebDriver driver;
	AddToCart cart;
	EditSIPDate date;
	
	@BeforeClass
	@Parameters("browser")
	
	public void BeforClass (String browser) {
		driver = BaseClass1.GEtBroweser(browser);
		}
	@BeforeMethod
	public void BeforMethod() {
		cart = new AddToCart(driver);
		date = new EditSIPDate(driver);
	}
	@Test
	
	public void Cart() {
		
			cart.ClickOnCartSymbol();
			cart.ClickOnAddFundBTN();
			cart.SerchForFund();
			cart.ICICIFund();
			cart.EnterAmount();
			cart.MutualFundAddToCart();
	}
	
	@Test
	public void EditSIPdate() {
		date.ClickOnEdiditDate();
		date.SelectSipDate();
		date.ClickOnConfirmBTN();
		
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
