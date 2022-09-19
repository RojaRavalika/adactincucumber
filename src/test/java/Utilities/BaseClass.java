package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static void LaunchedBrowser() {
		System.setProperty("webdriver.chrome.driver",Filepath.Chromepath);
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	public static void teardown() {
		driver.quit();
		
	}
	public static void navigation(String url) {
		driver.navigate().to(url);
	}
	public static void implicitwait() {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	public  static void screenshot() throws IOException {
		File srcShotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destinationFileName = "Adactin Hotel"+(new Date()).getTime()+".png";
		File destinationFile = new File("screenshots/"+destinationFileName);
		FileUtils.copyFile(srcShotFile,destinationFile);
	}
	public static void navigatingTo_HomePage() {
	    driver.get("https://adactinhotelapp.com/");
	}
}
