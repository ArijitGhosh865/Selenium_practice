package demo1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Test5_Fluentwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		/* Fluent Wait - It allows to specify the maximum time to wait for a condition and 
		check the condition for a given interval ( frequency )
		*/
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofSeconds(10))
				.ignoring(TimeoutException.class);
		try {
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		System.out.println("element is clickable");
		}
		catch(TimeoutException e){
			System.out.println("Element is not clickable");
			
		}
		finally {
			driver.quit();
		}
		

	}

}
