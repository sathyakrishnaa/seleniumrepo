package practiceWebelement;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HandlingDynamicWeb {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-table/#");
		WebElement table = driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div/div"));
		
		List<WebElement> tr = table.findElements(By.tagName("tr"));
		System.out.println(tr.size());
		
		for( int i = 1; i<tr.size(); i++)
		{
			 List<WebElement> tdvalues = table.findElements(By.tagName("td"));	
						if(tdvalues.indexOf(tdvalues)==10)
						{
					System.out.println(tdvalues.get(10).getText());
						}
				}
		}
		
		
	}
	

	/*
		
		
}
		
		
}
}
	*/