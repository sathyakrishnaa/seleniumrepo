package practiceWebelement;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException
	
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://staging.secure.ebs.in/");
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss,new File("C:\\Users\\anand\\Desktop\\Test.png"));
	}
	
}
