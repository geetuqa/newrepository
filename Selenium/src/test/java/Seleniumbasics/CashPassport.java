package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CashPassport {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","//Users//aarav//eclipse-workspace//Selenium//Drivers//chromedriver4" );
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.abhibus.com/");
//		driver.findElement(By.xpath("//html/body/nav/div/div[2]/ul/li[5]/a")).click();
		driver.get("https://www.cashpassport.com.au/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Home']"));
		driver.findElement(By.xpath("//a[contains(text(),'Fees')]"));
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")); 
		//driver.findElement(By.xpath("//p[@class='js-same-width w-animation-init']/a[1]")).click();
		//driver.findElement(By.xpath("//div[@class='page-content']/p/a")).click();
		WebElement dropElement = driver.findElement(By.className("trg-currency"));
	//	Select dropdwn = new Select(dropElement);
	//	System.out.println(dropdwn.selectByIndex(5));
		//dropdwn.selectByValue("JPY");
		driver.findElement(By.xpath("//div[@class='tabbed-content js-tab-content tab-opened']/div/div/div[3]/input")).sendKeys("0.78");
	//	dropdwn.selectByValue("CAD");
		//driver.findElement(By.xpath("//div[@class='js-tab-inner'] //a[text()='Order Cash Passport']")).click();
		////a[text()='Order Cash Passport']//parent::div/div/div/div/div//following-sibling::select 
	}
}
