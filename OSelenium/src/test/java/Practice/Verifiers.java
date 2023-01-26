package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verifiers {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		//Open the browser
		WebDriver driver=new ChromeDriver();
		//Enter the test url
		//driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 WebElement value = driver.findElement(By.xpath("//input[@name='email']"));
		
	    
	     
	}
}
