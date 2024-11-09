package demo1;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.*;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.get("URL");
		driver.manage().window().maximize();
		
		//handle multiple checkboxes
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("xpath"));
		
		for(int i = 0; i<checkboxes.size(); i++) {
			
			checkboxes.get(i).click();
		}

		
		

	}

}
