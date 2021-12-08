package Seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class automationpractice {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","//Users//aarav//eclipse-workspace//Selenium//Drivers//chromedriver 3" );
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com//");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@class='login']")).click();
        driver.findElement(By.id("email_create")).sendKeys("togeetuchopra@gmail.com");
        driver.findElement(By.xpath("//button[@name='SubmitCreate']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.id("id_gender2")).click();
        
        WebElement offradiobtn =  driver.findElement(By.id("id_gender2")); //FindElement method will search for the element with that properties information and returns the element reference once identifies
    
        Thread.sleep(2000);
        
        //Check the 'offradio' is getting displayed in the web page
            if(offradiobtn.isDisplayed())
            {
                System.out.println(" The  'off' radio button is displaying");
                //Check the 'offradio' button is in select status
                    if(offradiobtn.isSelected())
                        System.out.println(" 'offradio button is already in select status ");
                    else
                    {
                        System.out.println(" 'offradio button is already in NOT select status..selecting the radio button ");
                        offradiobtn.click();
                    }
	 }
            driver.findElement(By.id("customer_firstname")).sendKeys("Geetu");
            driver.findElement(By.id("customer_lastname")).sendKeys("Chopra");
            driver.findElement(By.id("email")).sendKeys("geetuchopra@gmail.com");
            driver.findElement(By.id("passwd")).sendKeys("kkkkkk123");
            WebElement days = driver.findElement(By.id("days"));
            Select daydd = new Select(days);
            daydd.selectByIndex(14);
            Thread.sleep(2000);
            WebElement months = driver.findElement(By.id("months"));
            Select monthsdd = new Select(months);
            monthsdd.selectByValue("12");
            List<WebElement> totEle = months.findElements(By.tagName("option"));
            int noOfOptions = totEle.size();
            
            for(int i = 0;i<noOfOptions;i++)
            {
            	System.out.println(totEle.get(i).getText());
            }
            
            WebElement years = driver.findElement(By.id("years"));
            Select yearsdd = new Select(years);
            yearsdd.selectByValue("1978");
            
            
	}
}
