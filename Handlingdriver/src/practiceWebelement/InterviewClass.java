package practiceWebelement;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.xml.internal.txw2.Document;

public class InterviewClass {
	public static void main(String[] args) throws IOException
	{		
		WebDriver driver = new FirefoxDriver();
		// Web Driver Methods
		driver.get("www.google.com");
		driver.getClass(); // class org.openqa.selenium.firefox.FirefoxDriver
		driver.getCurrentUrl();
		driver.getTitle();
		driver.getPageSource();
		driver.getWindowHandle();
		driver.getWindowHandles();
		driver.findElement(By.xpath("user001"));
		driver.findElements(By.xpath("user001"));
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().to("www.google.com");
		String url = "www.google.com";
		driver.navigate().to(url);
		driver.close();
		driver.quit();

		
		//Manage Cookies
		
		Cookie cook = new Cookie("username","sathya");
		driver.manage().addCookie(cook); //Create and add the cookie
		driver.manage().getCookies(); // Return The List of all Cookies
		driver.manage().getCookieNamed(url); //Return specific cookie according to name
		driver.manage().deleteAllCookies(); //deletes all the cookies
		driver.manage().deleteCookie(cook); // Delete specific cookie
		driver.manage().deleteCookieNamed(url); // Delete specific cookie according Name
		
		
		// Resizing the window
		
		driver.manage().window().maximize();
		driver.manage().window().fullscreen(); // Fullscreen the current window if it is not already fullscreen
		//method to set the size of window 
		Dimension d = new Dimension(500,700); 
		driver.manage().window().setSize(d);
		driver.manage().window().getSize();  // //output: (994, 718) ( Width, Height)
		
		int width = driver.manage().window().getSize().getWidth();
		int height = driver.manage().window().getSize().getHeight();
		 
		//set window position to 50 points from left side and 200 points from top side 

		 Point p = new Point(50,200);
		 driver.manage().window().setPosition(p);
		 driver.manage().window().getPosition().getX(); //window position from left side 
		 driver.manage().window().getPosition().getY(); //  window position from top side of screen 
		 
		 
		 // Implicit waits
		 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Explicit waits 
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user001")));
		
		
		// WebElement Methods
				
		WebElement element = driver.findElement(By.xpath("id009"));
		element.click();
		element.clear();
		String a = element.getAttribute("href"); 
		String b = element.getCssValue("font-size");
		String c = element.getTagName();
		String de = element.getText();
		boolean e = element.isDisplayed();
		boolean f = element.isEnabled();
		boolean g = element.isSelected();
		element.sendKeys("abc");
		element.submit();
			
		
		//Type Keys in Webdriver
				
		driver.findElement(By.id("name")).sendKeys(Keys.chord(Keys.CONTROL,"a"), Keys.chord(Keys.CONTROL,"c"));
		driver.findElement(By.id("pass")).sendKeys(Keys.chord(Keys.CONTROL,"v"), Keys.RETURN);
		
		// Swtich To()
		
		Alert ale = driver.switchTo().alert();
		ale.accept();
		ale.dismiss();
		ale.sendKeys("10");
		ale.getText();
		
		 WebElement act_element = driver.switchTo().activeElement(); //
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame(0);
		 driver.switchTo().frame(url);
		 driver.switchTo().frame(driver.findElement(By.xpath("user")));
		 driver.switchTo().parentFrame();
		 driver.switchTo().window("id");
		 
		 // code to switch to child window
		 Set<String> st = driver.getWindowHandles();
			Iterator<String> itr = st.iterator();
			itr.next();
			String second = itr.next();
			driver.switchTo().window(second);
		 
		// Move the webelement 
			WebElement drag = driver.findElement(By.id("draggable"));
			Actions act = new Actions(driver);
			act.dragAndDropBy(drag, 100, 200).build().perform();
			
		// right click and click the first option in the list
			act.contextClick(element).build().perform();
			act.sendKeys(Keys.ARROW_DOWN).build().perform();
			act.sendKeys(Keys.ENTER).build().perform();
		// Mouse over action	
			WebElement moveonmenu = driver.findElement(By.xpath("//div[@id='menu1']/div"));
			act.moveToElement(moveonmenu).build().perform();
			
		 // Selecting or Deselecting value from drop down 
		 
		//Explain select class for handling multiselect dropboxes
		 
			Select sel = new Select(driver.findElement(By.cssSelector("select[multiple='multiple']")));
			
			sel.selectByValue("ms2");
			sel.selectByIndex(3);
			sel.selectByVisibleText("second");
			sel.deselectAll();
			sel.deselectByIndex(1);
			sel.deselectByValue("testing");
			sel.deselectByVisibleText("autmoation");
			sel.getAllSelectedOptions(); // list <webElement>
			sel.getFirstSelectedOption();
			sel.getOptions(); // list <web element>
			
			
			
			List<WebElement> mulselect =  sel.getOptions();
			for (int i =0; i<mulselect.size(); i++)
			{
				System.out.println(mulselect.get(i).getText()); 
				
			}
			
		
			// It will return true if select box is multiselect else it will return false	
		 Select listbox = new Select(driver.findElement(By.xpath("//select[@name='FromLB']")));
		 boolean value = listbox.isMultiple();
		
		 // get all the webelements present in the webpage
		    List<WebElement> all = driver.findElements(By.xpath("//*"));
			System.out.println(all.size());
		
		// get all the links present in the webpage
			
			List<WebElement> alllink = driver.findElements(By.xpath("//a"));
			System.out.println(alllink.size());
			
		// get all the textboxes present in the webpage
			
			List<WebElement> alltext = driver.findElements(By.xpath("//input[@type = 'text']"));
			System.out.println(alltext.size());
		 
		 // how to get the values from the dropdown list and select the first value
		 
		 WebElement dropbox = driver.findElement(By.xpath(".//input[@id='testingDropdown']"));
			
			List<WebElement> dropvalues = dropbox.findElements(By.tagName("option"));
			System.out.println(dropvalues.size());
			for(int i = 0; i<dropvalues.size(); i++)
			{
				dropvalues.get(i).getText();
				dropvalues.get(1).click();
			}
			
		 // Capturing entire page screenshot  
		 File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(screenshot, new File("D:\\screenshot.jpg"));
		 
		 // Get the font details
		 
		    System.out.println(driver.findElement(By.tagName("b")).getCssValue("font-family"));
			System.out.println(driver.findElement(By.tagName("b")).getCssValue("font-style"));
			System.out.println(driver.findElement(By.tagName("b")).getCssValue("font-size"));
			System.out.println(driver.findElement(By.tagName("b")).getCssValue("color"));
			System.out.println(driver.findElement(By.tagName("b")).getCssValue("background-color"));
		 
		// get Web page title
		 String title = (String)((JavascriptExecutor)driver).executeScript("document.title");
		 // get domain name
		  String CurrentURL=(String)((JavascriptExecutor)driver).executeScript("return document.domain");
		 //Generate alert 
		  ((JavascriptExecutor)driver).executeScript("alert(This is the first testcase)");
		 //verify whether the page loaded or not
		  String status = (String)((JavascriptExecutor)driver).executeScript("return document.readystate");
		  // back using script
		  ((JavascriptExecutor)driver).executeScript("history.back()");
		  // forward using script
		  ((JavascriptExecutor)driver).executeScript("history.forward()");
		  // refresh
		  ((JavascriptExecutor)driver).executeScript("history.go(0)");
		  // window scrolling
			((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
		 
		 
		 // search engine
			
			try
			{
			WebElement search = driver.findElement(By.name("q"));
			search.sendKeys("a");
			
				
			int x = 1;
			
			while(true)
			{
				Thread.sleep(3000);
				
				String values = driver.findElement(By.xpath("html/body/div[1]/div[3]/form/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div/ul/li["+x+"]/div/div[2]")).getText();
						
						
				System.out.println(values);
				
				x++;
			
			}
			}catch (Throwable T)
			{
				System.out.println("end value");
			} 
		 
		 
		 
	}

}
