package Practice;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		//Open the browser
		ChromeOptions option=new ChromeOptions();
		option.addArguments("incognito");
		WebDriver driver=new ChromeDriver(option);
		driver.get("file:///C:/Users/Shobha/Documents/frame.html");
		Thread.sleep(2000);
		Dimension d= new Dimension(100, 200);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		Point p=new Point(200, 300);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		driver.manage().window().maximize();

	}

}
