package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	   System.out.println("Login page");
	   driver.findElement(By.xpath("//span[text()='Account & Lists']")).click();
	   //driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(2)")).click();
	  
	   
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		 System.out.println("U and P");
		 
		 JavascriptExecutor jsExecutor=(JavascriptExecutor) driver;
		 WebElement element=(WebElement)jsExecutor.executeScript("return document.getElementById('ap_email');");
		 element.sendKeys("9550243232");
		 
		 //driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9550243232");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Devesh@1234");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		 
		 
		
	}

	@And("click on login button")
	public void click_on_login_button() {
		 System.out.println("Click Login button");
		
	}

	@Then("user is navigate to home page")
	public void user_is_navigate_to_home_page() {
		 System.out.println("Home Page");
	}
	
	
	
	
	
	
	
	

}
