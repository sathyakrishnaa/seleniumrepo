
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;



public class Passparameter {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		Xls_Reader xr = new Xls_Reader("C:\\Users\\anand\\Desktop\\newfs.xlsx");
		driver.get("https://staging.secure.ebs.in/pg/ma/account/merchantaccount/action/summary/");
		xr.addColumn("addsheet", "result");
	
		
		for (int rownum = 2; rownum<=3; rownum++)
		{	
		
		driver.findElement(By.id("frmUsername")).sendKeys(xr.getCellData("addsheet", 0, rownum));
		driver.findElement(By.id("frmPassword")).sendKeys("EBSebs@1");
		driver.findElement(By.id("submitted")).click();
		
		try
		{
			Alert ale = driver.switchTo().alert();
			Thread.sleep(5000);
			ale.accept();
			
		} catch(NoAlertPresentException e)
		{
			System.out.println("no alert is displayed");
		}
		finally
		{
			driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/span[11]/a")).click();
		}			
						
		}
		}
		
	
}
