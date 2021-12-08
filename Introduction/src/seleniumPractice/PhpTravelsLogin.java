package seleniumPractice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PhpTravelsLogin {

	public static void main(String[] args) throws InterruptedException {
		int sizeOfLinks = 0;
		
		System.setProperty("webdriver.chrome.driver", "//Users//aarav//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();
		
		
		List<WebElement> el = driver.findElements(By.tagName("a"));
		sizeOfLinks = el.size();

	    for(int i=0;i<sizeOfLinks;i++)
	    {
	    
	    	
	    	if(!el.get(i).getText().isBlank())
	    	{
	    		el.get(i).getText();    	
	    	}
	    }
	    driver.findElement(By.xpath("//*[text()='Features']")).click();
	    //Thread.sleep(2000); 
	    driver.findElement(By.xpath("//*[text() = 'Login']")).click();
	 //   
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }

	    driver.findElement(By.id("inputEmail")).sendKeys("GeetuChopra");
	    driver.findElement(By.id("inputPassword")).sendKeys("Geetu");
		
	    driver.findElement(By.id("login")).click();
	    driver.findElement(By.xpath("//div[@class='container']/ul/li[3]")).click();
	    
	    driver.findElement(By.id("inputFirstName")).sendKeys("Geetu");
	    driver.findElement(By.id("inputLastName")).sendKeys("Chopra");
	    driver.findElement(By.id("inputEmail")).sendKeys("gg@gmail.com");
	    driver.findElement(By.xpath("//div[@class='iti-arrow']")).click();
	    

	   // driver.findElement(By.xpath("//*[text()='United States']")).click();
	    driver.findElement(By.xpath("//*[text()='India (भारत)']")).click();
	    driver.findElement(By.id("inputPhone")).sendKeys("111-111-1111");
	    driver.findElement(By.id("inputCompanyName")).sendKeys("testingQA");
	    driver.findElement(By.id("inputAddress1")).sendKeys("porter drive");
	    driver.findElement(By.id("inputCity")).sendKeys("Marlton");
	    driver.findElement(By.id("stateinput")).sendKeys("New Jersey");
	    driver.findElement(By.id("inputPostcode")).sendKeys("12345");
	  
	    Select countrydropDown = new Select(driver.findElement(By.id("inputCountry")));
	  
	    countrydropDown.selectByValue("IN");

	    List<WebElement> switchElement = driver.findElements(By
	            .cssSelector("div.bootstrap-switch-container"));

	 
	    if (switchElement.size() != 0) {

	        switchElement.get(0)
	                .findElement(By.cssSelector("span.bootstrap-switch-handle-off.bootstrap-switch-default")).click();

	    }
	    
	    driver.findElement(By.xpath("//input[@value='Register']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[contains(text(), 'View Cart')]")).click();
	    driver.findElement(By.id("inputPromotionCode")).sendKeys("ABCDEF");
	    driver.findElement(By.xpath("//button[@name='validatepromo']")).click();
	    
	}

}
