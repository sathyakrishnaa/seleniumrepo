package practiceWebelement;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFInalcheck {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
		
		WebElement check = driver.findElement(By.xpath(".//*[@id='commonWebElements']/form[2]"));
		List<WebElement> checkvalues = check.findElements(By.tagName("input"));
		System.out.println(checkvalues.size());
		for (int i = 0; i<checkvalues.size(); i++)
		{
			checkvalues.get(i).click();
		}
		
		driver.findElement(By.xpath(".//*[@id='AlertBox']/button")).click();
		Thread.sleep(2000);
		Alert ale = driver.switchTo().alert();
		ale.accept();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='ConfirmBox']/button")).click();
		Thread.sleep(3000);
		Alert ale1 = driver.switchTo().alert();
		ale1.dismiss();
		System.out.println("alert dismissed");
		
		Actions act = new Actions(driver);
		act.dragAndDrop(driver.findElement(By.xpath(".//*[@id='sourceImage']")), driver.findElement(By.xpath(".//*[@id='targetDiv']"))).build().perform();
		System.out.println("draganddropped");
	}

}
