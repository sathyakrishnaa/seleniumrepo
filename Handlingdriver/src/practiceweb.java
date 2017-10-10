import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practiceweb {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://staging.secure.ebs.in/");
		WebElement username = driver.findElement(By.xpath("html/body/div[1]/div/div/table[1]/tbody/tr/td/div/div/form/fieldset/dl/dd[2]/input"));
		boolean selectelement = username.isEnabled();
		System.out.println(selectelement);
		
		username.sendKeys("tanitha");
		WebElement password = driver.findElement(By.xpath("html/body/div[1]/div/div/table[1]/tbody/tr/td/div/div/form/fieldset/dl/dd[3]/input"));
		password.sendKeys("EBSebs@1");
		password.sendKeys(Keys.ENTER);
		
	}
	
}
