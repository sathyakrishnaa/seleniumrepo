import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Handlingdownloads {

public static void main(String[] args)
{
	ProfilesIni profile = new ProfilesIni();
	FirefoxProfile fp = profile.getProfile("newfox");
	fp.setPreference("browser.download.folderList", 2);
	fp.setPreference("browser.download.useDownloadDir", "C:\\Users\\anand\\Desktop\\sel\\new");
	fp.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip");
	WebDriver driver = new FirefoxDriver(fp);
	driver.get("http://www.seleniumhq.org/download/");
	driver.findElement(By.linkText("64 bit Windows IE")).click();
	
	
}
	
}
