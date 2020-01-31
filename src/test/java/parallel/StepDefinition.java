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
		driver.get("https://www.irobot.com/");
		System.out.println("On irobot.com page");
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
		driver.close();
		
	}
	
	//***********************************SUPPORT LINK SCENARIO************************************//
	
	private String url;
	

	private String support = "//A[@class='a-link a-link--nav'][text()='Support']";
	
	private String findans = "//A[@href='https://homesupport.irobot.com/?_ga=2.152020601.1100369275.1580400811-1583972020.1578588772'][text()='Find Answers']";
	

	private String regrob = "//A[@href='https://homesupport.irobot.com/app/utils/create_account/redirect/products%252Fregister?_ga=2.178227941.1100369275.1580400811-1583972020.1578588772'][text()='Register Robots']";
	

	private String ret_warr = "//A[@href='https://www.irobot.com/About-iRobot/Returns'][contains(text(),'Returns ')]";
	

	private String contact_cust_care = "//A[@href='https://homesupport.irobot.com/app/answers/detail/a_id/200?_ga=2.178227941.1100369275.1580400811-1583972020.1578588772'][text()='Contact Customer Care']";
	

	private String access_parts = "//A[@class='a-link'][contains(text(),'Accessories ')]";
	

	private String auth_resell = "//A[@class='a-link'][text()='Authorized Resellers']";
	
	
	@When("^user clicks on the support link$")
	public void user_clicks_on_the_support_link() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().window().maximize();
		driver.get("https://www.irobot.com/");
		System.out.println("On irobot.com page");
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
		driver.get("https://www.irobot.com/");
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
		driver.get("https://www.irobot.com/");
		user_clicks_on_the_support_link();
	}


	@When("^user clicks on Returns and warranties$")
	public void user_clicks_on_Returns_and_warranties() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(ret_warr)).click();
		url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("irobot.com"))
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
		driver.get("https://www.irobot.com/");
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
		driver.get("https://www.irobot.com/");
		user_clicks_on_the_support_link();
	}

	@When("^user clicks on authorized resellers$")
	public void user_clicks_on_authorized_resellers() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(auth_resell)).click();
		url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("irobot.com"))
		{
			Assert.assertTrue(true);
			System.out.println("Test Passed");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Test failed");
			
		}
		driver.get("https://www.irobot.com/");
		user_clicks_on_the_support_link();
		driver.close();
	}
	
	
	//***********************************About link scenario************************************//
	
	
	
	private String about = "//A[@class='a-link a-link--nav'][text()='About']";
	
	private String company_overview = "(//A[@class='a-link'][text()='Overview'][text()='Overview'])[1]";
	
	
	private String history = "//A[@class='a-link'][text()='History']";
	
	private String mng_team = "//A[@class='a-link'][text()='Leadership Team']";
	
	private String board_mem = "//A[@class='a-link'][text()='Board Members']";
	
	
	private String tech_org = "//A[@class='a-link'][text()='Technology Organization']";
	

	private String iR_ventures = "//A[@class='a-link'][text()='iRobot Ventures']";
	

	private String stem_overview = "(//A[@class='a-link'][text()='Overview'][text()='Overview'])[2]";
	

	private String stem_resource = "//A[@class='a-link'][text()='STEM Resources']";
	

	private String create_two = "//A[@class='a-link'][text()='Create 2']";
	

	private String create_two_proj = "//A[@class='a-link'][text()='Create 2 Projects']";
	
	private String investors_overview = "(//A[@class='a-link'][text()='Overview'][text()='Overview'])[3]";
	

	private String stock_info = "//A[@class='a-link'][text()='Stock Information']";
	

	private String press_overview = "(//A[@class='a-link'][text()='Media Kits']";
	

	private String careers_overview = "(//A[@class='a-link'][text()='Overview'][text()='Overview'])[4]";

	private String what_set_us = "//A[@class='a-link'][text()='What Sets Us Apart']";
	
	private String tech_futurist = "//A[@class='a-link'][text()='Tech Futurist']";
	

	private String Buss_genius = "//A[@class='a-link'][text()='Business Genius']";
	

	private String internships = "//A[@class='a-link'][text()='Internships']";
	

	private String how_we_hire = "//A[@class='a-link'][text()='How We Hire']";
	

	private String job_search = "//A[@class='a-link'][text()='Job Search']";

	
	public void loopdev() {
		if(url.contains("irobot.com"))
		{
			Assert.assertTrue(true);
			System.out.println("Test Passed");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Test failed");
			
		}
		driver.findElement(By.xpath(about)).click();

	}
	
	public void loopinvestor() {
		if(url.contains("investor"))
		{
			Assert.assertTrue(true);
			System.out.println("Test Passed");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Test failed");
			
		}
		driver.navigate().back();
	}
	
	public void loopmedia() {
		if(url.contains("media"))
		{
			Assert.assertTrue(true);
			System.out.println("Test Passed");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Test failed");
			
		}
		driver.navigate().back();
	}
	
	public void loopworkday() {
		if(url.contains("myworkdayjobs"))
		{
			Assert.assertTrue(true);
			System.out.println("Test Passed");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Test failed");
			
		}
		driver.navigate().back();
	}
	
	@When("^user clicks on the about link$")
	public void user_clicks_on_the_about_link() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().window().maximize();
		driver.get("https://www.irobot.com/");
		System.out.println("On irobot.com page");
		driver.findElement(By.xpath(about)).click();	
	}


	@When("^user checks all the links under company info$")
	public void user_checks_all_the_links_under_company_info() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(company_overview)).click();
		url = driver.getCurrentUrl();
		loopdev();

	}

	@When("^user checks all the links under stem$")
	public void user_checks_all_the_links_under_stem() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(company_overview)).click();
		url = driver.getCurrentUrl();
		loopdev();
		user_clicks_on_the_about_link();
	}

	@When("^user checks all the links under investors$")
	public void user_checks_all_the_links_under_investors() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(investors_overview)).click();
		url = driver.getCurrentUrl();
		user_clicks_on_the_about_link();
	}

	@When("^user checks all the links under press$")
	public void user_checks_all_the_links_under_press() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^user checks all the links under careers$")
	public void user_checks_all_the_links_under_careers() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(careers_overview)).click();
		url = driver.getCurrentUrl();
		loopdev();
		user_clicks_on_the_about_link();
		driver.close();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}