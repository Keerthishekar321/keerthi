package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleElemnts {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		int value = ele.size();
		System.out.println(value);
		for(WebElement a:ele) {
		String	links=a.getText();
			System.out.println(links);
		}
	}

}
