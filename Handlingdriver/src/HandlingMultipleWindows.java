import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingMultipleWindows {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSetups\\chromedriver_win32 (1)\\chromedriver.exe");
		

		WebDriver driver =new ChromeDriver();
		
		driver.get("https://ibank.standardchartered.co.in/nfs/login.htm");
		
	Set<String> wh=	driver.getWindowHandles();
	Iterator<String > it =wh.iterator();
	String mainWindoId =it.next();
	System.out.println("main window id is "+mainWindoId);
	
	
		driver.findElement(By.xpath(".//*[@id='command']/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody[2]/tr[2]/td/table/tbody/tr[1]/td[3]/table/tbody/tr/td/table[1]/tbody/tr[2]/td[2]/ul/li[1]/a[1]")).click();
		
		Thread.sleep(5000);
		
		wh=	driver.getWindowHandles();
		it =wh.iterator();
		it.next();
	String childWindow=	it.next();
	System.out.println("tabed window is "+childWindow);
		
		driver.switchTo().window(childWindow);
		
	driver.findElement(By.xpath(".//*[@id='universalNav']/li[2]/a")).click();
		
		
	System.out.println("after clicking ");
	
	wh=	driver.getWindowHandles();
	it =wh.iterator();
	it.next();
	it.next();
	String thirdWindowId =it.next();
	driver.switchTo().window(thirdWindowId);
	
	Thread.sleep(3000);
	//driver.close();
	driver.switchTo().window(childWindow);
	driver.close();
	driver.switchTo().window(thirdWindowId);
	driver.findElement(By.xpath(".//*[@id='login-menu']/ul/li[1]/a/span[1]")).click();
	
		
		
		
		
		
		
		
		
		
		
	}

}
