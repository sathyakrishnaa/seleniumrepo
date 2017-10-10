import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class securemultiplewindow {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://staging.secure.ebs.in/pg/ma/account/merchantaccount/action/summary/");
		driver.findElement(By.id("frmUsername")).sendKeys("mahmerchant");
		driver.findElement(By.id("frmPassword")).sendKeys("EBSebs@1");
		driver.findElement(By.id("submitted")).click();
		
		// click payment pages link
		
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[1]/div/div[2]/ul/li[9]/a")).click();
		
		//click preview button
		
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[2]/div/div[3]/fieldset/table/tbody/tr/td[5]/a[3]/img")).click();
		
		Set<String> st = driver.getWindowHandles();
		Iterator<String> itr = st.iterator();
		itr.next();
		String second = itr.next();
		driver.switchTo().window(second);
		Thread.sleep(13000);
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/form/div/div[2]/div[1]/div[2]/div/div/div[2]/div[3]/div[9]/label/a/i")).click();
		
		
	}

}
