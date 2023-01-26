package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Eml {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//it will close current browser tab
		driver.get("https://www.facebook.com/");
//		System.out.println("Title of the page is :"+driver.getTitle());
//		System.out.println("Current URL of the page is :"+ driver.getCurrentUrl());
//		System.out.println("Page source:"+driver.getPageSource());
		driver.get("https://www.flipkart.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	
		
	}

}
