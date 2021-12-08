import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//aarav//Downloads//chromedriver");

		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.manage().deleteAllCookies();
//		wb.manage().deleteCookieNamed("aaaa");
//		wb.manage()..addCookie(null)
		wb.get("https://www.google.com");
		File src = ((TakesScreenshot)wb).getScreenshotAs(OutputType.FILE);
		src.getName();

	}

}
