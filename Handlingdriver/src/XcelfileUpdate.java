import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
public class XcelfileUpdate {
	
	public static void main(String[] args)
	{
	Xls_Reader xr = new Xls_Reader("C:\\Users\\anand\\Desktop\\newfs.xlsx");
	xr.addColumn("addsheet", "result");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://staging.secure.ebs.in/");
	driver.findElement(By.id("frmUsername")).sendKeys(xr.getCellData("addsheet", 0, 2));
	driver.findElement(By.id("frmPassword")).sendKeys(xr.getCellData("addsheet", 1, 2));
	driver.findElement(By.id("submitted")).click();
	WebElement title = driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[2]/div/div[3]/div[1]/h2"));
	String ex_name = "My Account";
	String ac_name = title.getText();
	if(ex_name.equals(ac_name))
	
	{
		xr.setCellData("addsheet", "result", 2, "PASS");
	}
	else
	{
		//xr.setCellData("addsheet", "result", 2, "FAIL");
		System.out.println("Incorrect conditions");
	}	
	
		
	}

}
