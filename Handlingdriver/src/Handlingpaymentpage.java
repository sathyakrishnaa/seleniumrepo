import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlingpaymentpage {
	

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://staging.secure.ebs.in/pg/ma/account/merchantaccount/action/summary/");
		driver.findElement(By.id("frmUsername")).sendKeys("mahmerchant");
		driver.findElement(By.id("frmPassword")).sendKeys("EBSebs@1");
		driver.findElement(By.id("submitted")).click();
		
		// click payment pages link
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[1]/div/div[2]/ul/li[9]/a")).click();
		
		// click create new button
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[2]/div/div[2]/a")).click();
		
		// Enter page name
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[2]/div/div[3]/form/fieldset/p/input")).sendKeys("Newdesignpage");
		
		// select secure hash	
		WebElement dropdown = driver.findElement(By.id("SECURE_HASH_ALGORITHM"));
		dropdown.sendKeys("MD5");
		List<WebElement> secure_drop =  dropdown.findElements(By.tagName("option"));
		
		for (int i = 0; i<secure_drop.size(); i++)
		{
			System.out.println(secure_drop.get(i).getText());
			
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[2]/div/div[3]/form/fieldset/div[1]/div[1]/table/tbody/tr[1]/td[2]/input")).sendKeys("C:\\Users\\anand\\Desktop\\punjab_national_bank_logo_3901.gif");
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[2]/div/div[3]/form/fieldset/div[2]/input")).click();
	}

}
