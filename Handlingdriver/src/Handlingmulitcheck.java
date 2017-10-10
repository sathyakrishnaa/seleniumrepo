import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlingmulitcheck {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://staging.secure.ebs.in/pg/ma/account/merchantaccount/action/summary/");
		driver.findElement(By.id("frmUsername")).sendKeys("mahmerchant");
		driver.findElement(By.id("frmPassword")).sendKeys("EBSebs@1");
		driver.findElement(By.id("submitted")).click();
		
		// Click Accounts
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[1]/div/div[2]/ul/li[1]/a")).click();
		
		// click notification
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[1]/div/div[2]/ul/li[1]/ul/li[4]/a")).click();
		
		
		
		for(int i = 1; i<= 6; i++)
		{
			WebElement check = driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[2]/div/div[3]/form/fieldset[2]/table/tbody/tr[" + i + "]/td[2]/input"));
			List<WebElement> checklist = check.findElements((By.xpath("html/body/div[1]/div[3]/div/div[2]/div/div[3]/form/fieldset[2]/table/tbody/tr[" + i + "]/td[2]/input")));
		checklist.get(i).getText();
		checklist.get(1).click();
		
			
		}
	
	}
}
