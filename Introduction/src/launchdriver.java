import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchdriver {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//aarav//Downloads//chromedriver");
		 WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("geetschopra");
	String a = driver.getTitle();
	System.out.println(a);
	System.out.println(driver.getCurrentUrl());
	//System.out.println(driver.getPageSource());
	driver.get("http://www.yahoo.com");
	driver.navigate().back();
	//driver.get("http://www.gmail.com");
	//driver.navigate().forward();
    driver.close();//will close the current browser
	//driver.quit();//will  close all the browsersx 
	}
	

}
