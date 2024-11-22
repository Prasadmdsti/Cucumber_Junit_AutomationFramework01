package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);	
	}
	
	@FindBy(xpath="//input[@name=\"username\"]")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@name=\"signon\"]")
	@CacheLookup
	WebElement btnLogin;
	
	
	@FindBy(xpath="//a[@href=\"/actions/Account.action?signoff=\"]")
	@CacheLookup
	WebElement lnkLogout;
	
	public  void setUserName(String uname) {
		txtEmail.sendKeys(uname);
	}
	
	
	public  void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	
	
	public  void clickLogin() {
		btnLogin.click();
	}
	
	
	public  void clickLogout() {
		lnkLogout.click();
	}
	
	
	public static void main(String[] args) {
		

	}

}
