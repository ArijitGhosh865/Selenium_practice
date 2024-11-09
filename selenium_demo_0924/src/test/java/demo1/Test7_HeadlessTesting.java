package demo1;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7_HeadlessTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless=new");
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().window().maximize();
		

	}

}
