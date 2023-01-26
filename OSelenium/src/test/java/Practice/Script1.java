package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script1 {
public static void main(String[] args) throws Throwable {
	WebDriverManager.chromedriver().setup();
	//Open the browser
	WebDriver driver=new ChromeDriver();
	//Enter the test url
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//Enter the valid username 
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	//enter the valid paaword
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	//Click on login Button
	driver.findElement(By.xpath("//button[.=' Login ']")).click();
	//verify homepage is displayed or not
	String ele = driver.findElement(By.xpath("//h6[.='Dashboard']")).getText();
     System.out.println(ele);
     if(ele.equalsIgnoreCase("Dashboard"))
     {
    	 System.out.println("home page is displayed");
     }
     else
     {
    	 System.out.println("home page is not displayed");
 
     }
}
}
