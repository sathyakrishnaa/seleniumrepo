import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingDropDown {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSetups\\chromedriver_win32 (1)\\chromedriver.exe");
		

WebDriver driver =new ChromeDriver();
driver.get("http://www.echoecho.com/htmlforms11.htm");
WebElement dropDown =driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[5]/tbody/tr/td/table/tbody/tr/td/select"));
dropDown.sendKeys("Old Cheese");
List<WebElement> values =dropDown.findElements(By.tagName("option"));
System.out.println(values.size());

for(int x=0;x<values.size();x++)
{
	System.out.println(values.get(x).getText());
}

	}

}
