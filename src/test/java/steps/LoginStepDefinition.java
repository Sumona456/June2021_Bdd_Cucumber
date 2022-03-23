package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.DataBasePage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {	
	LoginPage loginpage;
	DataBasePage dataBasePage;
	
	@Before
	public void beforeRun() {
		initDriver();
		loginpage = PageFactory.initElements(driver,LoginPage.class );
		dataBasePage = new DataBasePage();
	}	
	@Given("^User is on Techfios login page$")	
	public void User_is_on_Techfios_login_page() {
		
		driver.get("https://www.techfios.com/billing/?ng=admin/");
	}
	
	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) throws Throwable {
		loginpage.enterPassword(password);
		Thread.sleep(3000);
	}
	@When("^User enters username as \"([^\"]*)\"$")	
	public void User_enters_username_as(String Username) throws InterruptedException {
		
		loginpage.enterUserName(Username);
		Thread.sleep(3000);		
	}	
	@And("^User clicks on Signin button$")
	public void user_clicks_on_Signin_button() throws Throwable {
		loginpage.clickSigninButton(); 
		Thread.sleep(3000);
	}
	@When("^User enters \"([^\"]*)\" from mysql database$")
	public void user_enters_from_mysql_database(String data) throws Throwable {
	  switch(data) {
	  case "username":
		  System.out.println("username from DB:"+ dataBasePage.getData("username"));
		  loginpage.enterUserName(dataBasePage.getData("username"));
		  Thread.sleep(3000);
		  break;
	  case"password":
		  System.out.println("password from DB:"+ dataBasePage.getData("password"));
		  loginpage.enterPassword(dataBasePage.getData("password"));
		  
		  break;
		  default:
			  System.out.println("unable to enter data");
	  }
	}

	@Then("^User should land on Dasboard page$")
	public void user_should_land_on_Dasboard_page() throws Throwable {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle =loginpage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		takeScreenshot(driver);
	}
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
