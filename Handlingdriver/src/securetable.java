import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class securetable {
	
	
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://staging.secure.ebs.in/pg/ma/account/merchantaccount/action/summary/");
		driver.findElement(By.id("frmUsername")).sendKeys("mahmerchant");
		driver.findElement(By.id("frmPassword")).sendKeys("EBSebs@1");
		driver.findElement(By.id("submitted")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[1]/div/div[2]/ul/li[1]/ul/li[2]/a")).click();
		
		// to get value from one cell
		
		System.out.println(driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[2]/div/div[3]/table/tbody/tr/td[1]/form[1]/fieldset/table/tbody/tr[1]/td[2]")).getText());
		
		//to get value from one row
		
		for(int i=1; i<=2; i++)
			
		{
			System.out.println(driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[2]/div/div[3]/table/tbody/tr/td[1]/form[1]/fieldset/table/tbody/tr[1]/td["+ i + "]")).getText());
		}
	
	// to get value from whole table
	
		for(int j=1; j<=2; j++)			
		{
			for (int k = 1; k <=6; k++)
				
			{
				System.out.println(driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[2]/div/div[3]/table/tbody/tr/td[1]/form[1]/fieldset/table/tbody/tr["+ k + "]/td[" + j + "]")).getText());
			}
			
		}
	
	
	}

}



