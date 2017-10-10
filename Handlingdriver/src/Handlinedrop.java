import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlinedrop {
	
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms11.htm");
		WebElement drop = driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[5]/tbody/tr/td/table/tbody/tr/td/select"));
		drop.sendKeys("Old Cheese");
		List<WebElement> values = drop.findElements(By.tagName("option"));
		System.out.println("Drop down has " + values.size() + "  " + "options");
		
		for (int i = 0; i<values.size(); i++)
		{
		System.out.println("The names of the drop down" + values.get(i).getText() );
		System.out.println(values.get(i).getAttribute("selected"));
				
		}
				}
	
}
