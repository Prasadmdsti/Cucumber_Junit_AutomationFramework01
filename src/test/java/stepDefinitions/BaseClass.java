package stepDefinitions;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import pageObjects.ClickOnDog;
import pageObjects.ClickonFish;
import pageObjects.CreateNewAccount;
import pageObjects.LoginPage;

public class BaseClass {

	public WebDriver driver;
	public LoginPage lp;
	public CreateNewAccount acccreate;
	public ClickonFish ckFish;
	public ClickOnDog ckDog;
   // public  Logger Logr;
	public  Properties configproperties;
    
  

	
	//generating random string for UserId
	public String randomString()//to generate random String
	{
		String randstring=RandomStringUtils.randomAlphabetic(10);

		return randstring;
	}	
	
	
}
