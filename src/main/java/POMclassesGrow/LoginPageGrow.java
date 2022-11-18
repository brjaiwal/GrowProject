package POMclassesGrow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageGrow {
	
	
	WebDriver driver;
	@FindBy(xpath = "//span[text()='Login/Register']")
	private WebElement LGBTN;
	
	@FindBy(xpath = "//input[@id='login_email1']")
	private WebElement EnterEmailID;
	
	@FindBy(xpath = "(//span[@class='absolute-center'])[1]")
	private WebElement ContinueBtn;
	
	@FindBy(xpath = "//input[@id='login_password1']")
	private WebElement EnterPassword;
	
	@FindBy(xpath = "(//span[@class='absolute-center'])[1]")
	private WebElement submitbtn;
	
	public LoginPageGrow(WebDriver driver)  {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void ClickForLogin() {
		LGBTN.click();
	}
	public void EnterEmailID() {
		EnterEmailID.sendKeys("brjaiwal1@gmail.com");
	}
	public void ClickOnContinuebtn() {
		ContinueBtn.click();
	}
	public void EnterPassword() {
		EnterPassword.sendKeys("Brj1@123");
	}
	public void ClickOnSubmitbtn() {
		submitbtn.click();
	}

}
