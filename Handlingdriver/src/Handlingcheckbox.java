import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlingcheckbox {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		for(int i=0;i<2;i++)
		{
		List<WebElement> st = driver.findElements(By.name("option"+i));
		st.get(i).click();
		Thread.sleep(1000);
		
		
		}
		 
	}
	
	

}
