import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentchildwindow {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", "//Users//aarav//Downloads//chromedriver");

		WebDriver wb = new ChromeDriver();
		wb.get("https://rahulshettyacademy.com/loginpagePractise/#");
		wb.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> wHandle = wb.getWindowHandles();
		Iterator<String> it = wHandle.iterator();
		String pWindow  = it.next();
		String cWindow = it.next();	
		wb.switchTo().window(cWindow);
		System.out.println(wb.findElement(By.cssSelector(".im-para.red")).getText());
		String email = wb.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		wb.switchTo().window(pWindow);
		wb.findElement(By.id("username")).sendKeys(email);
		
	}

}
