package practiceWebelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleCheckbox {
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
		
		List<WebElement> all = driver.findElements(By.xpath("//*"));
		System.out.println(all.size());
		
		List<WebElement> alllink = driver.findElements(By.xpath("//a"));
		System.out.println(alllink.size());
		
		List<WebElement> alltext = driver.findElements(By.xpath("//input[@type = 'text']"));
		System.out.println(alltext.size());
		
		WebElement dropbox = driver.findElement(By.xpath(".//input[@id='testingDropdown']"));
		
		List<WebElement> dropvalues = dropbox.findElements(By.tagName("option"));
		System.out.println(dropvalues.size());
		for(int i = 0; i<dropvalues.size(); i++)
		{
			dropvalues.get(i).getText();
			dropvalues.get(1).click();
		}
		
		System.out.println("done");
	}
	}
