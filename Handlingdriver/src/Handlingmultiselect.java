import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlingmultiselect {
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://compendiumdev.co.uk/selenium/basic_html_form.html");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td/textarea")).clear();
		
		
	Select sel = new Select(driver.findElement(By.cssSelector("select[multiple='multiple']")));
	sel.deselectAll();
	sel.selectByValue("ms2");
	sel.selectByIndex(3);
	List<WebElement> mulselect =  sel.getOptions();
	for (int i =0; i<mulselect.size(); i++)
	{
		System.out.println(mulselect.get(i).getText()); 
		
	}
	
	
	}

}
