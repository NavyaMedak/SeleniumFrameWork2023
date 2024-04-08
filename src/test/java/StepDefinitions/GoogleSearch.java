package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearch {

    WebDriver driver = null;
    
	@Given("browser is open")
	public void browser_is_open() {
		String Projectpath=System.getProperty("user.dir");
		System.out.println("Project Path:"+Projectpath);
		System.getProperty("webdriver.chrome.driver",Projectpath+"/src/main/resources/Drivers/chromedriver.exe");
	
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.manage().window().maximize();
	}


	@And("use is on google search page")
	public void use_is_on_google_search_page() {
		driver.navigate().to("https://www.google.com/");

	}

	@When("user enter the text on search page")
	public void user_enter_the_text_on_search_page() {
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("automation step by step");
	
	}

	@And("hits enter")
	public void hits_enter() {
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.ENTER);
	
	}

	@Then("user is navigate to search result")
	public void user_is_navigate_to_search_result() {
		driver.getPageSource().contains("Online Courses");
	
	}



}
