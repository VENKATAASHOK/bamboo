package parallel;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	public WebDriver driver = new ChromeDriver();
	

	
	@Before
	public void before(Scenario scenario) {
	}
	
	@BeforeStep
	public void beforeStep() throws InterruptedException {
		Thread.sleep(250);
	}
	
	
	//******************** ACCOUNT ICON SCENARIO*********************************//
	
	
	//(xpath = "(//I[@class='a-icon fa fa-user'])[1]")
	private String account = "(//I[@class='a-icon fa fa-user'])[1]";
	
	private String accounturl;
	private String storeurl = "store";
	
	
	@Given("^user is on dev Home Page$")
	public void user_is_on_dev_Home_Page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().window().maximize();
		driver.get("https://dev9.irobot.com/");
		System.out.println("On dev9 page");
	}


	@When("^he clicks on the account icon$")
	public void he_clicks_on_the_account_icon()  {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(account)).click();
		accounturl = driver.getCurrentUrl();
		System.out.println(accounturl);
	}

	@When("^he returns to the home page$")
	public void he_returns_to_the_home_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().back();
		System.out.println(accounturl);
		if(accounturl.contains(storeurl))
		{
			Assert.assertTrue(true);
			System.out.println("Test Passed");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Test failed");
		}
		
	}
	
	//***********************************SUPPORT LINK SCENARIO************************************//
	
	private String url;
	

	private String support = "//A[@class='a-link a-link--nav'][text()='Support']";
	
	private String findans = "//IMG[@src='/-/media/images/features/navigation/support/find_answers.ashx?h=300&la=en&mh=300&mw=300&w=300&lm=636898155040000000&hash=946FD382ACC418AB9602041B9F3830A8']";
	

	private String regrob = "//IMG[@src='/-/media/images/features/navigation/support/register_your_robot-700x700.ashx?h=300&la=en&mh=300&mw=300&w=299&lm=636898149330000000&hash=D3B42B3F04ECA900A5FA80BC077AFE8E']";
	

	private String ret_warr = "//IMG[@src='/-/media/images/features/navigation/support/warranty-700x578.ashx?h=247&la=en&mh=300&mw=300&w=300&lm=636898148920000000&hash=42153B64AA6D2DFFEB5C76ABFF084B95']";
	

	private String contact_cust_care = "//IMG[@src='/-/media/images/features/navigation/support/contact_care.ashx?h=300&la=en&mh=300&mw=300&w=300&lm=636898154700000000&hash=35E57AD308F4B5156E542629AD0B9338']";
	

	private String access_parts = "//A[@class='a-link'][contains(text(),'Accessories ')]";
	

	private String auth_resell = "//A[@class='a-link'][text()='Authorized Resellers']";
	
	
	@When("^user clicks on the support link$")
	public void user_clicks_on_the_support_link() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().window().maximize();
		driver.get("https://dev9.irobot.com/");
		System.out.println("On dev9 page");
		driver.findElement(By.xpath(support)).click();
	}


	@When("^user clicks on find answers$")
	public void user_clicks_on_find_answers() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(findans)).click();
		url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("homesupport"))
		{
			Assert.assertTrue(true);
			System.out.println("Test Passed");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Test failed");
			
		}
		driver.get("https://dev9.irobot.com/");
		user_clicks_on_the_support_link();
		System.out.println("out of find ans");
	}
	
	@When("^user clicks on Register Robots$")
	public void user_clicks_on_Register_Robots() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(regrob)).click();
		url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("homesupport"))
		{
			Assert.assertTrue(true);
			System.out.println("Test Passed");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Test failed");
			
		}
		driver.get("https://dev9.irobot.com/");
		user_clicks_on_the_support_link();
	}


	@When("^user clicks on Returns and warranties$")
	public void user_clicks_on_Returns_and_warranties() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(ret_warr)).click();
		url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("dev9"))
		{
			Assert.assertTrue(true);
			System.out.println("Test Passed");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Test failed");
			
		}
		user_clicks_on_the_support_link();
	}

	@When("^user clicks on contact customer care$")
	public void user_clicks_on_contact_customer_care() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(contact_cust_care)).click();
		url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("homesupport"))
		{
			Assert.assertTrue(true);
			System.out.println("Test Passed");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Test failed");
			
		}
		driver.get("https://dev9.irobot.com/");
		user_clicks_on_the_support_link();
	}

	@When("^user clicks on accesories and parts$")
	public void user_clicks_on_accesories_and_parts() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(access_parts)).click();
		url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("store.irobot.com"))
		{
			Assert.assertTrue(true);
			System.out.println("Test Passed");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Test failed");
			
		}
		driver.get("https://dev9.irobot.com/");
		user_clicks_on_the_support_link();
	}

	@When("^user clicks on authorized resellers$")
	public void user_clicks_on_authorized_resellers() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(auth_resell)).click();
		url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("dev9"))
		{
			Assert.assertTrue(true);
			System.out.println("Test Passed");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Test failed");
			
		}
		driver.get("https://dev9.irobot.com/");
		user_clicks_on_the_support_link();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}