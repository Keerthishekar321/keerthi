package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//Launching Chrome Browser
		WebDriver driver=new ChromeDriver();
		//Opening the App
		driver.get("file:///C:/Users/Shobha/Documents/Practice.html");
		//locate element with partialLinktext
		driver.findElement(By.partialLinkText("Goo")).click();
		
		

	}

}
