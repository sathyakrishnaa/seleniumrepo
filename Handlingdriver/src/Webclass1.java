import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webclass1 {
	public static void main(String[] args) throws IOException, InterruptedException
	{			
		System.setProperty("org.apache.commons.logging.Log",
			    "org.apache.commons.logging.impl.Jdk14Logger");
		
		Xls_Reader xr = new Xls_Reader("C:\\Users\\anand\\Desktop\\newfs.xlsx");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://staging.secure.ebs.in/");
		WebElement username = driver.findElement(By.xpath("html/body/div[1]/div/div/table[1]/tbody/tr/td/div/div/form/fieldset/dl/dd[2]/input"));
		//username.sendKeys("tanitha");
		username.sendKeys(xr.getCellData("addsheet", 0, 2));
		WebElement password = driver.findElement(By.xpath("html/body/div[1]/div/div/table[1]/tbody/tr/td/div/div/form/fieldset/dl/dd[3]/input"));
		//password.sendKeys("INdu$1234");
		password.sendKeys(xr.getCellData("addsheet", 1, 2));
		WebElement login = driver.findElement(By.xpath("html/body/div[1]/div/div/table[1]/tbody/tr/td/div/div/form/fieldset/dl/dd[4]/input"));
		login.click();
		WebElement logout = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/span[11]/a"));
		logout.click();
		
			
			
		
	}
}
