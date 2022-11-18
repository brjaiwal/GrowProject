package POMclassesGrow;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.Utilcass1;

public class AddToCart {
	
	WebDriver driver;
@FindBy(xpath = "//span[@class='absolute-center cartNum32']")
private WebElement Cartsymbl;

@FindBy(xpath = "(//span[@class='absolute-center'])[2]")
private WebElement AddFundBtn;

@FindBy(xpath = "//input[@id=\"globalSearch23\"]")
private WebElement stockSerch;

@FindBy(xpath = "(//span[text()='ICICI'])[1]")
private WebElement ICICIFund;


@FindBy(xpath = "//input[@max='Infinity']")
private WebElement EnterAmount;

@FindBy(xpath = "//div[text()='ADD TO CART']")
private WebElement AddToCartBTN;

public AddToCart(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver = driver;
	}

public void ClickOnCartSymbol() {
	try {
	Utilcass1.ExplicitWait(driver,Cartsymbl,15);
	}
	catch(Exception e) {
		Cartsymbl.click();
	}
//	Cartsymbl.click();
}
public void ClickOnAddFundBTN() {
	AddFundBtn.click();
}
public void SerchForFund() {

	stockSerch.sendKeys("ICICI");
	
	
	}
public void ICICIFund() {
	ICICIFund.click();
	}

public void EnterAmount() {
	EnterAmount.sendKeys("500");
}

public void MutualFundAddToCart() {
	AddToCartBTN.click();	
}
}
