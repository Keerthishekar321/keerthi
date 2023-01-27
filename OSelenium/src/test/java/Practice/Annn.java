package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annn {
	WebDriver driver;
@BeforeSuite
public void db() {
	System.out.println("connect to db");
}
@BeforeClass
public void openBrowser() {
	WebDriverManager.chromedriver().setup();
	//Open the browser
	driver=new ChromeDriver();
}
@BeforeMethod
public void loginApp() {
	driver.get("URl");
	//login.click();
}
@AfterMethod
public void logoutapp() {
	//logout.click():
}

@AfterClass
public void closeBrowser() {
	driver.close();
}
@AfterSuite
public void cd() {
	System.out.println("close database");
	//welcome
}
}
