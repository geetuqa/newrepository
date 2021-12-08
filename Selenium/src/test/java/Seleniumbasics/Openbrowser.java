package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","//Users//aarav//eclipse-workspace//Selenium//Drivers//chromedriver4" );
														
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("geetuchopra@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("hello");
		
		driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("geetuchopra@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("hello");
	


	}

}
