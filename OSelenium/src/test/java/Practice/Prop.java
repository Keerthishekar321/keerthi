package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prop {
  public static void main(String[] args) throws Throwable {
	 
	FileInputStream fis=new FileInputStream(".//src//test//resources//Data//data.properties");
	Properties prop=new Properties();
	prop.load(fis);
	String URL = prop.getProperty("url");
	String USER = prop.getProperty("username");
	String Pass = prop.getProperty("password");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get(URL);
	//driver.findElement(By.name("email")).sendKeys(USER).
	//driver.findElement(By.name("pass")).sendKeys(Pass);
	//driver.findElement(By.name("login")).click();
	
}

}
