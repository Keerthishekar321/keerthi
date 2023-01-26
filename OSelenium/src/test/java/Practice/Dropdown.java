package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Shobha/Documents/Dropdown.html");
		WebElement ele = driver.findElement(By.id("iyengar"));
		Select s=new Select(ele);
		List<WebElement> value = s.getOptions();
		for(WebElement a:value) {
			System.out.println(a.getText());
		}
		driver.quit();
		

	}

}
