package Applause_Qa;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


import cucumber.api.java.en.Then;



public class ApplauseTest2 {
	
	public static WebDriver driver = null;
	String customer2 = "Hyatt Hotels Corporation", brand2 = "Park Hyatt", location2 = "Chicago";
	
	@Then("^select created customer2 from the customer dropdown$")
	public void select_created_customer2_from_the_customer_dropdown() throws Throwable {
		Select customerDropdown = new Select(driver.findElement(By.id("custDropDown")));
		customerDropdown.selectByVisibleText(customer2);
	}
	
	@Then("^select created brand2 from the brand dropdown$")
	public void select_created_brand2_from_the_brand_dropdown() throws Throwable {
		Select brandDropdown = new Select(driver.findElement(By.xpath("//select [@ng-change='getLocations(rootBrand)']")));
		brandDropdown.selectByVisibleText(brand2);
	}
	
	@Then("^select created location2 from the location dropdown$")
	public void select_created_location2_from_the_location_dropdown() throws Throwable {
		Select brandDropdown = new Select(driver.findElement(By.xpath("//select [@ng-change='setRootLocation(rootLocation)']")));
		brandDropdown.selectByVisibleText(location2);
	}

	
	@Then("^enter in all the customer field details$")
	public void enter_in_all_the_customer_field_details() throws Throwable {
		driver = ApplauseTest1.getdriver();
		driver.findElement(By.name("cname")).sendKeys(customer2);
		driver.findElement(By.xpath("//textarea [@ng-model='company.add']")).sendKeys("71 South Wacker Dr 12th Floor, Chicago, IL 60606");
		driver.findElement(By.name("cpname")).sendKeys("Sourav Sehgal");
		driver.findElement(By.name("cpemail")).sendKeys("sourav.sehgal@logituit.com");
		driver.findElement(By.name("cptel")).sendKeys("9494943033");
		driver.findElement(By.name("caname")).sendKeys("Nalini Vemula");
		driver.findElement(By.name("caemail")).sendKeys("nalini.vemula@logituit.com");
		driver.findElement(By.name("catel")).sendKeys("7676567555");
		
	}

	@Then("^enter in all the brand field details$")
	public void enter_in_all_the_brand_field_details() throws Throwable {
		driver.findElement(By.name("bname")).sendKeys(brand2);
		driver.findElement(By.id("fileLogo")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\Automation Testing\\Cucumber\\Applause\\Uploads\\Park Hyatt.exe");
		Thread.sleep(2000);
		driver.findElement(By.id("br")).clear();
		driver.findElement(By.id("br")).clear();
		driver.findElement(By.id("br")).sendKeys("128");
		driver.findElement(By.id("bg")).clear();
		driver.findElement(By.id("bg")).clear();
		driver.findElement(By.id("bg")).sendKeys("128");
		driver.findElement(By.id("bb")).clear();
		driver.findElement(By.id("bb")).clear();
		driver.findElement(By.id("bb")).sendKeys("255");
		driver.findElement(By.id("ba")).clear();
		driver.findElement(By.id("ba")).clear();
		driver.findElement(By.id("ba")).sendKeys("1");
		driver.findElement(By.id("fr")).clear();
		driver.findElement(By.id("fr")).sendKeys("0");
		driver.findElement(By.id("fg")).clear();
		driver.findElement(By.id("fg")).sendKeys("0");
		driver.findElement(By.id("fb")).clear();
		driver.findElement(By.id("fb")).sendKeys("160");
		driver.findElement(By.id("fa")).clear();
		driver.findElement(By.id("fa")).sendKeys("1");
		driver.findElement(By.name("bpname")).sendKeys("Chetan Gangele");
		driver.findElement(By.name("bpemail")).sendKeys("chetan.gangele@logituit.com");
		driver.findElement(By.name("bptel")).sendKeys("756-546-4455");
		driver.findElement(By.name("baname")).sendKeys("Anusha Bhandaru");
		driver.findElement(By.name("baemail")).sendKeys("anusha.bhandaru@logituit.com");
		driver.findElement(By.name("batel")).sendKeys("989-589-4845");
		Select ratinImage = new Select(driver.findElement(By.id("ratingSelect")));
		ratinImage.selectByVisibleText("Star");
		driver.findElement(By.xpath("//input [@ng-model='brand.empPersPref']")).sendKeys("My Passion");
		Select brandType = new Select(driver.findElement(By.xpath("//select [@ng-change='setReasons(brand.reasons)']")));
		brandType.selectByVisibleText("Rental car");
	   
	}

	@Then("^enter in all the location field details$")
	public void enter_in_all_the_location_field_details() throws Throwable {
		driver.findElement(By.name("lname")).sendKeys(location2);
		driver.findElement(By.name("laddress")).sendKeys("800 N Michigan Ave, Chicago, IL 60611");
		driver.findElement(By.id("locImg")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\Automation Testing\\Cucumber\\Applause\\Uploads\\Chicago.exe");
		Thread.sleep(2000);
		driver.findElement(By.name("latitude")).sendKeys("41.8971196");
		driver.findElement(By.name("longitude")).sendKeys("-87.6276909");
		driver.findElement(By.name("lradius")).sendKeys("10");
		driver.findElement(By.name("pname")).sendKeys("Arun Kumar");
		driver.findElement(By.name("pemail")).sendKeys("arun.kumar@logituit.com");
		driver.findElement(By.name("pcontact")).sendKeys("9872498723");
		driver.findElement(By.name("pemailf")).click();
		driver.findElement(By.name("psmsf")).click();
		driver.findElement(By.name("aname")).sendKeys("Rahul Jat");
		driver.findElement(By.name("aemail")).sendKeys("rahul.jat@logituit.com");
		driver.findElement(By.name("acontact")).sendKeys("7987389473");
		driver.findElement(By.name("aemailf")).click();
		driver.findElement(By.name("asmsf")).click();
		
	   
	}

	@Then("^enter in all the employee field details$")
	public void enter_in_all_the_employee_field_details() throws Throwable {
		driver.findElement(By.name("fname")).sendKeys("Brandon");
		driver.findElement(By.name("lname")).sendKeys("James");
		driver.findElement(By.name("email")).sendKeys("brendon.james@logituit.com");
		driver.findElement(By.name("contact")).sendKeys("9879898809");
		driver.findElement(By.id("fileImg")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\Automation Testing\\Cucumber\\Applause\\Uploads\\Brendon James.exe");
		Thread.sleep(2000);
		driver.findElement(By.name("empId")).sendKeys("HR3534");
		//driver.findElement(By.name("beaconId")).sendKeys("wr938sdf89sd32");
		driver.findElement(By.name("roleName")).sendKeys("Service Express Attendant");
		driver.findElement(By.name("dept")).sendKeys("Guest Services");
		driver.findElement(By.name("empPref")).sendKeys("Travelling, Cricket");
		driver.findElement(By.name("sdate")).sendKeys("07/31/2001");
	    
	}

	
}
	
	


