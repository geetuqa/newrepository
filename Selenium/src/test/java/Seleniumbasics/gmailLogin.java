package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmailLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","//Users//aarav//eclipse-workspace//Selenium//Drivers//chromedriver 3" );
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("identifierId")).sendKeys("abcde");
        driver.findElement(By.xpath("//button[(text()='Forgot email?')]")).click();
        				 
 //       driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("geetu.qa");
 //       driver.findElement(By.xpath("//span[text()='Next']")).click();
 //       Thread.sleep(2000);
        //WebDriverWait wait = new WebDriverWait(driver,30);      
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='fdWl7b']/div/div/div/div/div[1]/input")));
 //       driver.findElement(By.xpath("//div[@class='fdWl7b']/div/div/div/div/div[1]/input")).sendKeys("Geetika123@");
 //       driver.findElement(By.xpath("//span[text()='Next']")).click();
			
	}

}
