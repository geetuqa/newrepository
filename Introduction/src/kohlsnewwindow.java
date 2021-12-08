import java.awt.Window;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class kohlsnewwindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","//Users//aarav//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kohls.com/");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//div[@class='new-dc-equity-banner']/a[2]/span")).click();
	    Thread.sleep(2000);
	    driver.close();
	   
	    System.out.println("which url " + driver.switchTo().window(driver.getWindowHandle()));
	  //  driver.get("https://www.kohls.com/");
	  //  driver.close();
	 //   driver.switchTo().window(child);
	
	}

}
