package stepDefinitions;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pageObjects.ClickOnDog;
import pageObjects.ClickonFish;
import pageObjects.CreateNewAccount;
import pageObjects.LoginPage;

public class Steps extends BaseClass {
	
	@Before
	public void setup() throws IOException
	{
		configproperties=new Properties();
	    FileInputStream configprfile=new FileInputStream("src\\test\\resources\\config.properties");
	    configproperties.load(configprfile);
	    
	    String brwsr=configproperties.getProperty("browser");
	    
	    if(brwsr.equals("chrome"))
	    {
		driver=new ChromeDriver();

	    }
	    else if(brwsr.equals("edge"))
	    {
			driver=new EdgeDriver();
	    }
	    else
	    {
	    	driver=new FirefoxDriver();	
	    }
	
	}
	
	
	//Login Feature
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		lp=new LoginPage(driver);
	}

	@When("user opens URL {string}")
	public void user_opens_url(String url) {
		//Logr.info("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXlaunch the application**********************************************");
		driver.get(url);
	}

	@When("user enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) throws InterruptedException {
	   lp.setUserName(email);
	   Thread.sleep(2000);
		lp.setPassword(password);
	}

	@When("click on login")
	public void click_on_login() {
	    lp.clickLogin();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) {
	  
	if(driver.getPageSource().contains("HTTP Status 500 – Internal Server Error"))
	{
		//Logr.info("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXBrowserclosing**********************************************");		
		driver.close();
		Assert.assertTrue(false);
	}
	else
	{
		Assert.assertEquals(title, driver.getTitle());
	}
	
	}

	@When("user click on logout link")
	public void user_click_on_logout_link() throws InterruptedException {
	    Thread.sleep(2000);
		lp.clickLogout();
	}


	@Then("close browser")
	public void close_browser() throws InterruptedException {
	 Thread.sleep(2000);
		driver.quit();
	}	
	
	
	//Create Account feature
	
	
	@Then("user click on signin")
	public void user_click_on_signin() {
		acccreate=new CreateNewAccount(driver);
//Logr.info("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXclick on signin**********************************************");		
		acccreate.clicksignin();
		
	}
	
	
	@When("click on Rigister Now")
	public void click_on_rigister_now() throws InterruptedException {
		Thread.sleep(2000);
		
		acccreate.clickRegistration();
	}
	
	
	@Then("user can view the Dashboad")
	public void user_can_view_the_dashboad() {
		
		Assert.assertEquals("JPetStore Demo",acccreate.Titleofthepage());
	}
	
	
	@When("user enters the details")
	public void user_enters_the_details() throws InterruptedException {
	String useridd=randomString();	
		Thread.sleep(2000);
//Logr.info("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXEntering details**********************************************");		
		acccreate.Enteruserid(useridd);	
		acccreate.EnterNew_password("1234");
		acccreate.EnterRepeat_password("1234");
		Thread.sleep(2000);
		acccreate.EnterFirst_name("prasad");
		acccreate.EnterLast_name("med");
		acccreate.EnterEmail("kjnvkjnfdknv@gmail.com");
		acccreate.EnterPhone("985835889589");
		acccreate.EnterAddress_1("hgfhgdhv n bvxgs");
		Thread.sleep(2000);
		acccreate.EnterAddress_2("nlnljhouyuiyuiyo jkgglf");
		acccreate.EnterCity("hyderabad");
		acccreate.EnterState("ts");
		acccreate.EnterZip("500000");
		acccreate.EnterCountry("india");
	}
	
	
	@When("click on save account information")
	public void click_on_save_account_information() throws InterruptedException {
		Thread.sleep(2000);
		acccreate.clicksave_account_information();
	}

	
	
	
	
//Click on fish
	
	@When("user click on Fish")
	public void user_click_on_fish() throws InterruptedException {
		ckFish=new ClickonFish(driver);	
		
		Thread.sleep(2000);
		ckFish.clickfish();	
	    
	}
	
	
	@Then("user should found fish in page")
	public void user_should_found_fish_in_page() {
		Assert.assertEquals("Fish",ckFish.fishword() ); 
		
	}

	
	//click on dog
	@Then("user return to post login page")
	public void user_return_to_post_login_page() throws InterruptedException {
		ckDog=new ClickOnDog(driver); 
		Thread.sleep(2000);
		ckDog.clickreturnlink();
	}
	
	
	@Then("user click on Dog")
	public void user_click_on_dog() throws InterruptedException {
		Thread.sleep(2000);
		ckDog.clickdog();
	}
	
	@Then("user should found Dog word in page")
	public void user_should_found_dog_word_in_page() {
		Assert.assertEquals("Dogs",ckDog.dogword()); 
	}

	
	
	

}
