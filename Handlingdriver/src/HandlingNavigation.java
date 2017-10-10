import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingNavigation {
	
	public static void main(String [] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.uasc.net/en");
		WebElement parent = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/ul/li[1]/span"));
		WebElement child = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/ul/li[1]/ul/li[2]/a"));
		
		Actions act = new Actions(driver);
		act.moveToElement(parent).build().perform();
		child.click();
	}

}
