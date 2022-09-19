package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilities.BaseClass;
import io.cucumber.java.en.*;

public class Login_Step extends BaseClass {
	
	@Given("Lunching Chrome Browser page")
	public void lunching_chrome_browser_page() {
		System.out.println("LUNCHING THE CHROME BROWSER");
		LaunchedBrowser();
	    
	}

	@When("Enter the url page {string}")
	public void enter_the_url_page(String url) {
		driver.get(url);
	    
	}


	@Then("Open the Adactin Hotel page")
	public void open_the_adactin_hotel_page() {
		System.out.println("OPEN THE ADACTIN HOTEL PAGE");
	    
	}
	
	
	@Given("Navigate To Adactin Hotel Login page")
	public void navigate_to_adactin_hotel_login_page() {
		System.out.println("SUCESSFUL OPEN THE PAGE");
		
	    
	}

	@When("Enter username and password  {string},{string}")
	public void enter_username_and_password(String username, String password) {
		 WebElement ele =driver.findElement(By.xpath("//input[@id='username']"));
		 ele.sendKeys("phanindra1234");
		 WebElement paw =driver.findElement(By.xpath("//input[@id='password']"));
		 paw.sendKeys("123456");
		 WebElement log = driver.findElement(By.xpath("//input[@name='login']"));
		 log.click();
	    
	}

	@Then("validate the login function")
	public void validate_the_login_function() {
		System.out.println("LOGIN SUCCESSFULLY");
	    
	}
	@Given("Launched the hotel details page")
	public void launched_the_hotel_details_page() {
		System.out.println("OPEN DETAILS SUCCESSFULLY");
	    
	}

	@When("Enter th Details adactin hotel")
	public void enter_th_details_adactin_hotel() {
		WebElement loc= driver.findElement(By.xpath("//select[@id='location']"));
		loc.sendKeys("London");
		WebElement hot= driver.findElement(By.xpath("//select[@name='hotels']"));
	    hot.sendKeys("Hotel Creek");
	    WebElement room= driver.findElement(By.xpath("//select[@id='room_type']"));
	    room.sendKeys("Double");
	    WebElement no = driver.findElement(By.xpath("//select[@name='room_nos']"));
	    no.sendKeys("1-One");
	    WebElement check_in = driver.findElement(By.xpath("//input[@class='date_pick']"));
	    check_in.sendKeys("16/08/2022");
	    WebElement check_out = driver.findElement(By.xpath("//input[@name='datepick_out']"));
	    check_out.sendKeys("17/09/2022");
	    WebElement adults = driver.findElement(By.xpath("//select[@id='adult_room']"));
	    adults.sendKeys("2-Two");
	    WebElement children = driver.findElement(By.xpath("//select[@name='child_room']"));
	    children.sendKeys("0-None");
	    
	}

	@Then("Click on the search button")
	public void click_on_the_search_button() {
		WebElement ser =driver.findElement(By.xpath("//input[@name='Submit']"));
		ser.click();
		System.out.println("ENTER THE DETAILS SUCESSFULLY ");
	    
	}
	@Given("Navigate to Welocme to the group Hotel")
	public void navigate_to_welocme_to_the_group_hotel() {
		System.out.println("WELCOME TO THE ADACTIN GROUP OF HOTELS");
	    
	}

	@When("click to the button adactin hotel")
	public void click_to_the_button_adactin_hotel() {
		WebElement sel = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		sel.click();
		WebElement cont = driver.findElement(By.xpath("//input[@id='continue']"));
		cont.click();
		
	    
	}

	@Then("click continue to the button")
	public void click_continue_to_the_button() {
		System.out.println("CONTINUE SUCESSFUL");
	    
	}
	@Given("Launched the adactin hotel")
	public void launched_the_adactin_hotel() {
		System.out.println("Enter Details Browser");
	    
	}

	@When("Enter the Details Hotel")
	public void enter_the_details_hotel() {
		WebElement first = driver.findElement(By.xpath("//input[@id='first_name']"));
	    first.sendKeys("sudhananda");
	    WebElement last = driver.findElement(By.xpath("//input[@id='last_name']"));
	    last.sendKeys("Gaddala");
	    WebElement address  = driver.findElement(By.xpath("//textarea[@id='address']"));
	    address.sendKeys("Anantapur, Andhra pradesh");
	    WebElement card = driver.findElement(By.xpath("//input[@id='cc_num']"));
	    card.sendKeys("1234567899876543");
	    WebElement typecard= driver.findElement(By.xpath("//select[@class='select_combobox']"));
	    typecard.sendKeys("VISA");
	    WebElement date= driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
	    date.sendKeys("January");
	    WebElement expiry= driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
	    expiry.sendKeys("2022");
	    WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
	    cvv.sendKeys("222");
	    
	    
	}

	@Then("Click on the book now")
	public void click_on_the_book_now() {
		WebElement book = driver.findElement(By.xpath("//input[@id='book_now']"));
		book.click();
		System.out.println("U6TPX86EL9");
	   
	}




}
