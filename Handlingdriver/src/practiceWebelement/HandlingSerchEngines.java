package practiceWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingSerchEngines {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand\\Desktop\\sel\\Jar files\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.google.com");
		
	
		try 
		{
			WebElement allValues =driver.findElement(By.name("q"));
			allValues.sendKeys("a");
			
			Thread.sleep(5000);
			
			int x=1;
			
			while(true)
			{
				
			String data =	driver.findElement(By.xpath("html/body/div[1]/div[3]/form/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div/ul/li["+x+"]/div/div[2]")).getText();
			System.out.println(data);
			x++;
		}
		
		
		}catch(Throwable t )
		{
			System.out.println("end value ");
		}
		
		
		

	}

}
