package testNGbasics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	public static WebDriver driver;
 // @Test
 // public void f() {
//  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver","//Users//aarav//eclipse-workspace//Selenium//Drivers//chromedriver4" );
		
	    driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

  @Test(priority=0)
  public void enterUserPass() {
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
  }

  @Test(priority=1)
  public void clickLogin() {
	  driver.findElement(By.id("btnLogin")).click();
	  
  }
  
  @Test(priority=2)
  public void welcomeUserLink() {
	  driver.findElement(By.id("welcome")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }
  @Test(priority=3)
  public void logoutClick() {
	  driver.findElement(By.xpath("//a[text()='Logout']")).click();
	  
  }
  
}
