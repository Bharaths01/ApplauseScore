package Applause_Qa;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ApplauseTest1 {
	
	public static WebDriver driver = null;
	String customer1 = "Dine Equity, Inc.", brand1 = "Applebee's", location1 = "Fairfax, VA", empId = "AL1E123";

	@Given("^go to applause site$")
	public void go_to_applause_site() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://applause-qa.appspot.com/");
		}

	@Then("^enter super admin credentials$")
	public void enter_super_admin_credentials() throws Throwable {
	   driver.findElement(By.name("email")).sendKeys("admin@meimodo.com");
	   driver.findElement(By.name("password")).sendKeys("password");
	  
	}

	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
		 driver.findElement(By.linkText("Login")).click();
	}

	@Given("^click on the customer menu link$")
	public void click_on_the_customer_menu_link() throws Throwable {
		implicitWait();
		driver.findElement(By.xpath("//a [@ng-class='custClass']")).click();
	}

	@Then("^click the Add new button$")
	public void click_the_Add_new_button() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Add New')]")).click();
		
	}

	@Then("^enter the customer mandatory fields$")
	public void enter_the_customer_mandatory_fields() throws Throwable {
		driver.findElement(By.name("cname")).sendKeys(customer1);
	}

	@And("^click on save button$")
	public void click_on_save_button() throws Throwable {
		driver.findElement(By.xpath("//button [text()[contains(.,'Save')]]")).click();
	}

	@Given("^click on the brand menu link$")
	public void click_on_the_brand_menu_link() throws Throwable {
		implicitWait();
		driver.findElement(By.xpath("//a [@ng-class='brandClass']")).click();
	}

	@Then("^select created customer1 from the customer dropdown$")
	public void select_created_customer1_from_the_customer_dropdown() throws Throwable {
		Select customerDropdown = new Select(driver.findElement(By.id("custDropDown")));
		customerDropdown.selectByVisibleText(customer1);
	}

	@Then("^enter the brand mandatory fields$")
	public void enter_the_brand_mandatory_fields() throws Throwable {
		driver.findElement(By.name("bname")).sendKeys(brand1);
		Select ratinImage = new Select(driver.findElement(By.id("ratingSelect")));
		ratinImage.selectByVisibleText("Smiley");
	}
	
	@Given("^click on the location menu link$")
	public void click_on_the_location_menu_link() throws Throwable {
		implicitWait();
		driver.findElement(By.xpath("//a [@ng-class='locClass']")).click();
	}

	@Then("^select created brand1 from the brand dropdown$")
	public void select_created_brand1_from_the_brand_dropdown() throws Throwable {
		Select brandDropdown = new Select(driver.findElement(By.xpath("//select [@ng-change='getLocations(rootBrand)']")));
		brandDropdown.selectByVisibleText(brand1);
	}

	

	@Then("^enter the location mandatory fields$")
	public void enter_the_location_mandatory_fields() throws Throwable {
		driver.findElement(By.name("lname")).sendKeys(location1);
		driver.findElement(By.name("laddress")).sendKeys("12970 Fair Lakes Shopping Center, Fairfax, VA 22033");
	}


	@Given("^click on the employee menu link$")
	public void click_on_the_employee_menu_link() throws Throwable {
		implicitWait();
		driver.findElement(By.xpath("//a [@ng-class='empClass']")).click();
	}

	@Then("^select created location1 from the location dropdown$")
	public void select_created_location1_from_the_location_dropdown() throws Throwable {
		Select brandDropdown = new Select(driver.findElement(By.xpath("//select [@ng-change='setRootLocation(rootLocation)']")));
		brandDropdown.selectByVisibleText(location1);
	}


	@Then("^enter the employee mandatory fields$")
	public void enter_the_employee_mandatory_fields() throws Throwable {
		driver.findElement(By.name("fname")).sendKeys("Aamir");
		driver.findElement(By.name("lname")).sendKeys("Khan");
		driver.findElement(By.name("empId")).sendKeys(empId);
		driver.findElement(By.name("roleName")).sendKeys("Multi-Unit Manager");
	}
	
	@Given("^click on the beacon menu link$")
	public void click_on_the_beacon_menu_link() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a [@ng-class='beaconClass']")).click();
		
	}

	@Then("^click on the Assign individual button$")
	public void click_on_the_Assign_individual_button() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Assign Individual')]")).click();
		
	}

	@Then("^enter the beacon id$")
	public void enter_the_beacon_id() throws Throwable {
		driver.findElement(By.name("beaconId")).sendKeys("abc583d4156a4730");
	}

	@Then("^select the added beacon using checkbox$")
	public void select_the_added_beacon_using_checkbox() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div [@ng-click='headerButtonClick($event)']")).click();
	}

	@Then("^click on pair individual button$")
	public void click_on_pair_individual_button() throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(),'Pair Individual')]")).click();
	}

	@Then("^enter the employee id$")
	public void enter_the_employee_id() throws Throwable {
		driver.findElement(By.xpath("//input [@ng-model='beacon.empData']")).sendKeys(empId);
	}

	@Then("^click on search button$")
	public void click_on_search_button() throws Throwable {
		driver.findElement(By.xpath("//button [text()[contains(.,'Search')]]")).click();
	}

	@Then("^click on pair button$")
	public void click_on_pair_button() throws Throwable {
		driver.findElement(By.xpath("//label [text()[contains(.,'Pair')]]")).click();
	}

	@And("^pair successfull message is displayed$")
	public void pair_successfull_message_is_displayed() throws Throwable {
		String expected = driver.findElement(By.xpath("//strong[contains(text(),'Beacon and Employee successfully paired !!!')]")).getText();
		String actual = "Beacon and Employee successfully paired !!!";
		assertEquals(expected, actual);
	}
	
	@Then("^click on unpair button$")
	public void click_on_unpair_button() throws Throwable {
		implicitWait();
		driver.findElement(By.xpath("//a[contains(text(),'Pair Individual')]/following-sibling::a[contains(text(),'Unpair')]")).click();
		//div[@class='alert alert-success']/strong[contains(text(),'Beacon Individual Un-Pair Successfull. 1 success.')]
	}
	
	@Then("^click on Yes to confirm$")
	public void click_on_Yes_to_confirm() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button [text()[contains(.,'Yes')]]")).click();
	}

	@And("^unpair successfull message is displayed$")
	public void unpair_successfull_message_is_displayed() throws Throwable {
		//Thread.sleep(1000);
		WebDriverWait wait=new WebDriverWait(driver, 1);
		String xpath= "//strong[contains(text(),'Beacon Individual Un-Pair Successfull. 1 success.')]";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		String expected = driver.findElement(By.xpath(xpath)).getText();
		System.out.println(expected);
		String actual = "Beacon Individual Un-Pair Successfull. 1 success.";
		assertEquals(expected, actual);
	}
	
	@Then("^click on unassign button$")
	public void click_on_unassign_button() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Pair Individual')]/following-sibling::a[contains(text(),'Unassign')]")).click();
	}
	
	@And("^unassign successfull message is displayed$")
	public void unassign_successfull_message_is_displayed() throws Throwable {
		Thread.sleep(1000);
		String expected = driver.findElement(By.xpath("//strong[contains(text(),'Beacon Individual Un-Assignment Successfull.with 1 unassigned.')]")).getText();
		String actual = "Beacon Individual Un-Assignment Successfull.with 1 unassigned.";
		assertEquals(expected, actual);
	}
	
	@Given("^click on the logout link$")
	public void click_on_the_logout_link() throws Throwable {
		driver.findElement(By.xpath("//i[@class='fa fa-angle-down']")).click();
		driver.findElement(By.xpath("//a [text()[contains(.,'Logout')]]")).click();
		
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		driver.close();
	}

	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	public static WebDriver getdriver() {
		return driver;
	}
}

	
