import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class webElements {
	
	ChromeDriver driver=new ChromeDriver();
	static WebElement UserName;
	static WebElement Password;
	static WebElement DisplayManager;
	
	void xPaths() throws InterruptedException
	{
	      
		driver.get("https://cms-thunderbolt.test.env.works/sitecore/client/Applications/Launchpad?sc_lang=en");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		UserName=driver.findElement(By.xpath("//input[@id='i0116']"));
		UserName.sendKeys("Shivva.Naresh@ivycomptech.com");
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(4000);
		//driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		
		Password=driver.findElement(By.xpath("//input[@id='i0118']"));
		Password.sendKeys("Devesh@1234");
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//div[@data-bind='text: display'])[1]")).click();
		Thread.sleep(10000);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		DisplayManager=driver.findElement(By.xpath("//a[@title='Display Manager']"));
		DisplayManager.click();
		System.out.println(driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[@viewBox='0 0 24 24'])[1]")).click();
		
		
				
	}
	void TackScreenShots() throws IOException, InterruptedException {
		Thread.sleep(5000);
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\shivva.naresh\\OneDrive - Entain Group\\Desktop\\Automation\\login.jpg"));
				
	}

}
