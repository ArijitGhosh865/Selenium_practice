package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Test6_JavascriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("location.reload()"); // for reload page
		js.executeScript("alert('hello world');"); // for send alert
		
		

	}

}
