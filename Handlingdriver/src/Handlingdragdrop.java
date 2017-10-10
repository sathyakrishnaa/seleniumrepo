import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Handlingdragdrop {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.xpath("html/body/div[1]"));
		WebElement drop = driver.findElement(By.xpath("html/body/div[2]"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
				System.out.println("Testcase success");
	}
	
}
