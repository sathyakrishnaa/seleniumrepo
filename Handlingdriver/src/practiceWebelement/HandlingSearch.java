package practiceWebelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingSearch {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=QLBlWcaxJuHx8Aeb_Lu4AQ&gws_rd=ssl");
		try
		{
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("a");
		
			
		int x = 1;
		
		while(true)
		{
			Thread.sleep(3000);
			
			String values = driver.findElement(By.xpath("html/body/div[1]/div[3]/form/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div/ul/li["+x+"]/div/div[2]")).getText();
					
					
			System.out.println(values);
			
			x++;
		
		}
		}catch (Throwable T)
		{
			System.out.println("end value");
		}
	}

}
