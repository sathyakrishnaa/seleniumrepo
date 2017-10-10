package practiceWebelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class devexpress {
	public static void main(String[] args) throws InterruptedException
	{

	WebDriver driver = new FirefoxDriver();
	driver.get("https://demos.devexpress.com/ASPxEditorsDemos/ListEditors/MovingItems.aspx");
	
	WebElement list = driver.findElement(By.xpath(".//*[@id='ContentHolder_lbAvailable_D']"));

	

for(int i = 1; i<=11; i++)
{
		List<WebElement> listall = driver.findElements(By.className("dxeListBoxItemRow_Metropolis"));
		listall.get(i).click();
}

Thread.sleep(5000);
driver.findElement(By.xpath(".//*[@id='ContentHolder_btnMoveSelectedItemsToRight_CD']/span")).click();

System.out.println("Testcase passed");

}
}