package practiceWebelement;

	import java.util.List;

import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
	public class ArtofTesting {
		public static void main(String[] args) throws InterruptedException
		{	
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
		Thread.sleep(5000);
		String sampletext = driver.findElement(By.tagName("b")).getText();
		System.out.println(sampletext);
				
		driver.findElement(By.linkText("This is a link")).click();
		System.out.println("Successful link clicked");
		
		driver.findElement(By.name("firstName")).sendKeys("TESTBOX");
		
		driver.findElement(By.id("idOfButton")).click();
		System.out.println("submit clicked");
		
		Actions act = new Actions(driver);
		act.doubleClick(driver.findElement(By.id("dblClkBtn"))).build().perform();
		System.out.println("double click done");
		
		Alert ale = driver.switchTo().alert();
		ale.accept();
		
		List<WebElement> radio = driver.findElements(By.name("gender"));
		for (int i = 0; i<radio.size(); i++)
		{			
			System.out.println(radio.get(i).getAttribute("value"));
		}
		radio.get(0).click();
		System.out.println("option female clicked successfully");
		
		List<WebElement> check=driver.findElements(By.xpath(".//*[@id='commonWebElements']/form[2]"));
		
		for (int j = 1; j<check.size(); j++)
		{			
		
			List<WebElement> checkvalues = driver.findElements(By.xpath(".//*[@id='commonWebElements']/form[2]/input["+j+"]"));
			checkvalues.get(1).click();
			
			
		}
		
		
		System.out.println("done");
		
		
}


}