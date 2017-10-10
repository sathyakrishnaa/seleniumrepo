
	import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.firefox.FirefoxProfile;
	public class Xcelmultiple {
		
		public static void main(String[] args) throws InterruptedException
		{
		Xls_Reader xr = new Xls_Reader("C:\\Users\\anand\\Desktop\\newfs.xlsx");
		xr.addColumn("addsheet", "result");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://staging.secure.ebs.in/");
		for(int i=2; i<xr.getRowCount("addsheet"); i++)
		{
		driver.findElement(By.id("frmUsername")).sendKeys(xr.getCellData("addsheet", 0, i));
		driver.findElement(By.id("frmPassword")).sendKeys(xr.getCellData("addsheet", 1, i));
		driver.findElement(By.id("submitted")).click();
		Thread.sleep(2000);	
	
		WebElement title = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/span[11]/a"));
		String ex_name = "Logout";
		String ac_name = title.getText();
		if(ex_name.equals(ac_name))
		
		{
			xr.setCellData("addsheet", "result", i, "PASS");
		}
		else
		{
			xr.setCellData("addsheet", "result", i, "FAIL");		
		}		
		title.click();	
			
		}
	}
	}

