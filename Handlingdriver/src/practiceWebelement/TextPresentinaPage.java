package practiceWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TextPresentinaPage {
	
	public static void main(String[] args)
	{
	        WebDriver driver = new FirefoxDriver();
	        driver.get("http://www.goibibo.com/");
	       
	        
	        //verify 'International Flights' text is there in the web page or not
	        String expText = "International Flights"; 
	        
	        //first way to verify by using locator and getText() method
	        String actText = driver.findElement(By.xpath("//*")).getText();
	        if(actText.contains(expText)){
	            System.out.println("1) Expected text '"+expText+"' present in the web page.");
	        }else{
	            System.out.println("1) Expected text '"+expText+"' is not present in the web page.");
	        }
	        
	        //second way to verify by using getPageSource method
	        String pageSource = driver.getPageSource();
	        if(pageSource.contains(expText)){
	            System.out.println("2) Expected text '"+expText+"' present in the web page.");
	        }else{
	            System.out.println("2) Expected text '"+expText+"' is not present in the web page.");
	        }
	        driver.close();
	    }
	}


