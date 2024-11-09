package demo1;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// WebDriver driver = new ChromeDriver(); //upcasting
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		
		//Take full screen Screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir") + "\\screenshots\\fullpage.png");
		sourcefile.renameTo(targetfile);
		
		//Capture Screenshot of specific sections
		WebElement ld = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div"));
		File sf2 =ld.getScreenshotAs(OutputType.FILE);
		File targetfile2 = new File(System.getProperty("user.dir") + "\\screenshots\\loginInfo.png");
		sf2.renameTo(targetfile2);

	}

}
