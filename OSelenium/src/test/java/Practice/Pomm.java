package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomm {
@FindBy(name="email")
private WebElement emailtf;
@FindBy(name="pass")
private WebElement passtf;
@FindBy(name="login")
private WebElement loginbtn;
public WebElement getEmailtf() {
	return emailtf;
}
public WebElement getPasstf() {
	return passtf;
}
public WebElement getLoginbtn() {
	return loginbtn;
}
public Pomm(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void login() {
	emailtf.sendKeys("keer");
	passtf.sendKeys("123");
	loginbtn.click();
}
public void login(String name,String pasdd) {
	emailtf.sendKeys(name);
	passtf.sendKeys(pasdd);
	loginbtn.click();
}
}
