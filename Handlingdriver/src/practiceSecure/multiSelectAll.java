package practiceSecure;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiSelectAll {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();		
		
		{
		
		driver.get("https://qa.secure.ebs.in/pg/ma/reporting/reporting/action/selectFields/");
		}
		
		driver.findElement(By.id("frmUsername")).sendKeys("srirep");
		driver.findElement(By.id("frmPassword")).sendKeys("EEee@11");
		driver.findElement(By.id("submitted")).click();
		driver.findElement(By.linkText("Account List")).click();
		//WebElement ele = driver.findElement(By.xpath(".//*[@id='frmReport']/fieldset[1]"));
		
		List<WebElement> listvalues = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
		
		
		for(int i=1; i<=listvalues.size(); i++)
		{
		   if(listvalues.get(i).isSelected())
		   {
			   System.out.println("already selected");
		   }
		   else
		   {
			listvalues.get(i).click();		
		   }
		}
		
		
	
}
}