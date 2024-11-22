package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccount {

	public WebDriver ldriver;
	
	public CreateNewAccount(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);	
	}	
	
	By signin=By.xpath("//a[normalize-space()='Sign In']");
	By Registration=By.xpath("//a[normalize-space()='Register Now!']");
	
	By User_ID=By.xpath("//input[@name=\"username\"]");
	By New_password=By.xpath("//input[@name='password']");
	By Repeat_password=By.xpath("//input[@name='repeatedPassword']");
	By First_name=By.xpath("//input[@name='account.firstName']");	
	By Last_name=By.xpath("//input[@name='account.lastName']");	
	By Email=By.xpath("//input[@name='account.email']");	
	By Phone=By.xpath("//input[@name='account.phone']");	
	By Address_1=By.xpath("//input[@name='account.address1']");	
	By Address_2=By.xpath("//input[@name='account.address2']");	
	By City=By.xpath("//input[@name='account.city']");	
	By State=By.xpath("//input[@name='account.state']");	
	By Zip=By.xpath("//input[@name='account.zip']");	
	By Country=By.xpath("//input[@name='account.country']");
	By save_account_information=By.xpath("//input[@name='newAccount']");
	
	//Actions methods
	
	
	public String Titleofthepage()
	{
		return ldriver.getTitle();	
	}
	
	public void clicksignin()
	{
		 ldriver.findElement(signin).click();	
	}
	
	
	public void clickRegistration()
	{
		ldriver.findElement(Registration).click();	
	}
	
	
	public void Enteruserid(String userid)
	{
		ldriver.findElement(User_ID).sendKeys(userid);	
	}
	
	public void EnterNew_password(String password1)
	{
		ldriver.findElement(New_password).sendKeys(password1);	
	}
	
	public void EnterRepeat_password(String password2)
	{
		ldriver.findElement(Repeat_password).sendKeys(password2);	
	}
	
	public void EnterFirst_name(String Firstname)
	{
		ldriver.findElement(First_name).sendKeys(Firstname);	
	}
	
	public void EnterLast_name(String Lastname)
	{
		ldriver.findElement(Last_name).sendKeys(Lastname);	
	}
	
	public void EnterEmail(String emal1)
	{
		ldriver.findElement(Email).sendKeys(emal1);	
	}
	
	public void EnterPhone(String Phone1)
	{
		ldriver.findElement(Phone).sendKeys(Phone1);	
	}
	
	public void EnterAddress_1(String Address_11)
	{
		ldriver.findElement(Address_1).sendKeys(Address_11);	
	}
	
	public void EnterAddress_2(String Address_22)
	{
		ldriver.findElement(Address_2).sendKeys(Address_22);	
	}


	public void EnterCity(String City1)
	{
		ldriver.findElement(City).sendKeys(City1);	
	}
	
	

	public void EnterState(String state1)
	{
		ldriver.findElement(State).sendKeys(state1);	
	}
	
	
	public void EnterZip(String Zip1)
	{
		ldriver.findElement(Zip).sendKeys(Zip1);	
	}
	
	public void EnterCountry(String Country1)
	{
		ldriver.findElement(Country).sendKeys(Country1);	
	}
	
	public void clicksave_account_information()
	{
		ldriver.findElement(save_account_information).click();	
	}
	
	
	
	
	
	
	
	
	
	
}
