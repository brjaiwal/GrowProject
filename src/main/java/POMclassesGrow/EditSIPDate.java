package POMclassesGrow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EditSIPDate {
	WebDriver driver;
	
	@FindBy(xpath="(//span[@class='itc67SipDiv'])[1]")
	private WebElement ClickOnEditBTN;
	
	@FindBy(xpath = "(//div[text()='14']")
	private WebElement SelectSipDAte;
	
	@FindBy(xpath = "(//span[@class='absolute-center'])[1]]")
	private WebElement ConfirmBTN;
	
	
	public EditSIPDate(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
	}
	public void ClickOnEdiditDate() {
		ClickOnEditBTN.click();
	}
	
	public void SelectSipDate() {
		SelectSipDAte.click();
	}
	
	public void ClickOnConfirmBTN() {
		ConfirmBTN.click();
	}
	
	
	}
