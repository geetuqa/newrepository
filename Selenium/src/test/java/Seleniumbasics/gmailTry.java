package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailTry {
	//Added by GEETU
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","//Users//aarav//eclipse-workspace//Selenium//Drivers//chromedriver4" );
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
        driver.manage().window().maximize();
     
   //     driver.findElement(By.className("VfPpkd-vQzf8d")).click();
        driver.findElement(By.xpath("//span[text()='Create account']")).click();
        
        driver.findElement(By.className("VfPpkd-StrnGf-rymPhb-b9t22c")).click();
        driver.findElement(By.id("firstName")).sendKeys("Geetu");
        driver.findElement(By.id("lastName")).sendKeys("Chopra");
        driver.findElement(By.id("username")).sendKeys("geetschopra");
        driver.findElement(By.name("Passwd")).sendKeys("admin1234@");
        driver.findElement(By.name("ConfirmPasswd")).sendKeys("admin1234@");
     //   driver.findElement(By.className("VfPpkd-muHVFf-bMcfAe")).click();
        driver.findElement(By.xpath("//span[text()='Next']")).click();	
        
	}

}
