package practiceWebelement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandlingFont {
	public static void main(String[] args) throws InterruptedException
	{	
	
	WebDriver driver = new FirefoxDriver();
	driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
	Thread.sleep(5000);
	System.out.println(driver.findElement(By.tagName("b")).getCssValue("font-family"));
	System.out.println(driver.findElement(By.tagName("b")).getCssValue("font-style"));
	System.out.println(driver.findElement(By.tagName("b")).getCssValue("font-size"));
	System.out.println(driver.findElement(By.tagName("b")).getCssValue("color"));
	System.out.println(driver.findElement(By.tagName("b")).getCssValue("background-color"));
	System.out.println("done");
}
}