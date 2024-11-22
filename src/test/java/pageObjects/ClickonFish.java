package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class ClickonFish {

public WebDriver ldriver;
	


	public ClickonFish(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		
	}	
	
	@FindBy(how=How.XPATH,using="//img[@src=\"../images/fish_icon.gif\"]")
	@CacheLookup
	WebElement Fishlink;
	
	@FindBy(how=How.XPATH,using="//div[@id=\"Catalog\"]//h2")
	@CacheLookup
	WebElement Fishtext;
	
//Action methods
	
	public void clickfish()
	{
	
		Fishlink.click();	
	
	}
	
	public String fishword()
	{
		
		return Fishtext.getText();	
	
	}
	
}
