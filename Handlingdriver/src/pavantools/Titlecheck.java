package pavantools;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Titlecheck {
	@Test
	public void titletest() throws InterruptedException, AWTException
	{
		WebDriver driver=new FirefoxDriver();
		
		assert.assertEquals(actual, expected);
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://sathya.ebsdev.local/v3/");
		WebElement element = driver.findElement(By.xpath("html/body/table/tbody/tr/th/div/div[2]/form/table/tbody/tr[6]/td[2]/input"));
		
		driver.findElement(By.xpath("html/body/table/tbody/tr/th/div/div[2]/form/table/tbody/tr[6]/td[2]/input")).clear();
		driver.findElement(By.xpath("html/body/table/tbody/tr/th/div/div[2]/form/table/tbody/tr[6]/td[2]/input")).sendKeys("16472");
		driver.findElement(By.xpath("html/body/table/tbody/tr/th/div/div[2]/form/table/tbody/tr[38]/td/input[1]")).click();
		
	/*
		
		Dimension dim = new Dimension(500,600);
		driver.manage().window().setSize(dim);
		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.manage().window().getSize().getHeight());
		System.out.println(driver.manage().window().getSize().getWidth());
		
		Point point = new Point(500,600);
		driver.manage().window().setPosition(point);
		System.out.println(driver.manage().window().getPosition());
		System.out.println(driver.manage().window().getPosition().getX());
		System.out.println(driver.manage().window().getPosition().getY());
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.attributeContains(By.id("frmusername"), "color", "blue"));
		
		/*
		
		Select select = new Select(driver.findElement(By.id("frmUsername")));
		
		
		
	Robot rob = new Robot();
		driver.get("https://qa.secure.ebs.in/");
		driver.findElement(By.id("frmUsername")).sendKeys("sritxn");
		
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_A);
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_C);
		
		driver.findElement(By.id("frmPassword")).click();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		*/
}

		}
	
	
	


