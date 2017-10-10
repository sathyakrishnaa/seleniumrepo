import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingRadio {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		List <WebElement> rad = driver.findElements(By.name("group1"));
		rad.get(1).click();
		System.out.println(rad.size());
		for(int i = 0; i<rad.size(); i++)
		{
			System.out.println(rad.get(i).getAttribute("value") + "  " + rad.get(i).getAttribute("checked"));
		}
	}
}
