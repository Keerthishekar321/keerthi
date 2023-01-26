package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ts{
	@Test(enabled = false)
	public void createcontact() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String actual = driver.getTitle();
		String expected = "Facebook – log in or sign up";
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void modifycontact() {
		System.out.println("contact is modified");
	}

	
}
