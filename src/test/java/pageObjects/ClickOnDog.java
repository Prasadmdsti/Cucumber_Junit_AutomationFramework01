package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class ClickOnDog {

	public WebDriver ldriver;
	
		public ClickOnDog(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(ldriver, this);
			
		}	
	
		@FindBy(how=How.XPATH,using="//a[@href=\"/actions/Catalog.action\"]")
		@CacheLookup
		WebElement returnlink;
		
		
		@FindBy(how=How.XPATH,using="//img[@src=\"../images/dogs_icon.gif\"]")
		@CacheLookup
		WebElement Doglink;
		
		@FindBy(how=How.XPATH,using="//div[@id=\"Catalog\"]//h2")
		@CacheLookup
		WebElement Dogtext;
		
	//Action methods
		
		
		public void clickreturnlink()
		{
		
			returnlink.click();	
		
		}
		
		public void clickdog()
		{
		
			Doglink.click();	
		
		}
		
		public String dogword()
		{
			
			return Dogtext.getText();	
		
		}







}
