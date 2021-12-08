package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draggable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","//Users//aarav//eclipse-workspace//Selenium//Drivers//chromedriver4" );
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com");
        driver.manage().window().maximize();
       
        driver.findElement(By.xpath("//a[text()='Resizable']")).click();
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
  //      WebElement drag = driver.findElement(By.id("draggable"));
  //      Actions a = new Actions(driver);
  //      Thread.sleep(2000);
  //      a.dragAndDropBy(drag,120, 10).build().perform();

        
  //      WebElement resize  = driver.findElement(By.id("resizable"));
  //      System.out.println("Resize" + resize);
      //  Actions a = new Actions(driver);
       // a.dragAndDropBy(resize, 1,10).build().perform();
   //     Actions action = new Actions(driver);
    //    WebElement Element = driver.findElement(By.xpath("//div[@id='signUpModal']")); 

        Actions a = new Actions(driver); 
        WebElement element = driver.findElement(By.xpath("//*[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
        a.clickAndHold(element).moveByOffset(50, 20).perform();      
	}
	
	


}
