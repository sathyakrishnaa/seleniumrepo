import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Handlingalert {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://softwaretestingplace.blogspot.in/2017/03/javascript-alert-test-page.html");
		
		WebElement pop = driver.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/div/div/button"));
		System.out.println(pop.getLocation().getX());
		
		String value = pop.getTagName();
		System.out.println(value);
		pop.click();
		Alert ale = driver.switchTo().alert();
		System.out.println(ale.getText());
		ale.accept();
		Actions action = new Actions(driver);
		action.moveToElement(pop).moveToElement(pop).click().build().perform();
		action.moveByOffset(pop.getLocation().getX(), pop.getLocation().getY());
	}
	
}
