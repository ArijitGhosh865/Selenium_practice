package demo1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// WebDriver driver = new ChromeDriver(); //upcasting
		
		//Explicit Wait
		WebDriverWait mywait =new WebDriverWait( driver,Duration.ofSeconds(15));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement TxtU = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		TxtU.sendKeys("Admin");
		
		WebElement TxtP = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		TxtP.sendKeys("admin123");
		
		WebElement TLogin = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//Button[normalize-space()='Login']")));
		TLogin.click();
		//
		


	}

}
