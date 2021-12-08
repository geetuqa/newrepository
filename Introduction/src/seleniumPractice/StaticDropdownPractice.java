package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdownPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//aarav//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		WebElement wb = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select drpdown  = new Select(wb);
		drpdown.selectByIndex(3);
		System.out.println(drpdown.getFirstSelectedOption().getText());
		drpdown.selectByValue("INR");
		System.out.println(drpdown.getFirstSelectedOption().getText());
		drpdown.selectByVisibleText("AED");
		System.out.println(drpdown.getFirstSelectedOption().getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("btnclosepaxoption")).click();
	}

}

