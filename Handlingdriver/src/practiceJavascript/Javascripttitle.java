package practiceJavascript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Javascripttitle {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://toolsqa.com/automation-practice-table/#");
		/*
		String s = (String)((JavascriptExecutor)driver).executeScript("return document.title");
		System.out.println(s);
		//create alert
		((JavascriptExecutor)driver).executeScript("alert('Please Input')");
		try
		{
			Alert ale = driver.switchTo().alert();
			ale.accept();
			
		}catch(Throwable e)
		{
			System.out.println("no alert present");
		}
		finally
		{
			
		((JavascriptExecutor)driver).executeScript("history.go(0)");
		String status = (String)((JavascriptExecutor)driver).executeScript("return document.readystate");
		System.out.println(status);
		System.out.println("Refresh done");
		driver.findElement(By.xpath("html/body/div[1]/div[1]/header/nav/ul/li[1]/a/span[1]/span/span")).click();
		((JavascriptExecutor)driver).executeScript("history.back()");
		*/
		driver.manage().window().maximize();
		//((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
		
		driver.manage().wait(30);
		
		WebDriverWait waidt = new WebDriverWait(driver,30);
		WebElement element1 = waidt.until(ExpectedConditions.elementToBeClickable(By.id("frmpassword")));
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		
			       .withTimeout(30, SECONDS)
			       .pollingEvery(5, SECONDS)
			       .ignoring(NoSuchElementException.class);
			   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.id("Element"));
			     }
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		System.out.println("end reached");
		
		
	}

}


