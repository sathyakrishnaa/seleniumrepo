package practiceWebelement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeActions {
	public static void main(String[] args)
	{
	
	// Mouse hover and click the option from sub menu
	
	WebDriver driver = new FirefoxDriver();
	driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
	WebElement menu = driver.findElement(By.id("fname"));
	Actions act = new Actions(driver);	
	
	act.contextClick(menu).build().perform();
	act.sendKeys(Keys.ARROW_DOWN).build().perform();
	act.sendKeys(Keys.ARROW_DOWN).build().perform();
	act.sendKeys(Keys.ARROW_DOWN).build().perform();
	act.sendKeys(Keys.ARROW_DOWN).build().perform();
	act.sendKeys(Keys.ENTER).build().perform();
	System.out.println("success");

	act.doubleClick(driver.findElement(By.id("dblClkBtn"))).build().perform();
	Alert ale = driver.switchTo().alert();
			ale.accept();
	System.out.println("alert accepted");
}
}