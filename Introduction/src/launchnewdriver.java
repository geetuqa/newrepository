import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class launchnewdriver {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "//Users//aarav//Downloads//chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
	
		List<WebElement> el = driver.findElements(By.tagName("a"));
		int linkssize = el.size();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("women dress");
		driver.findElement(By.id("nav-search-submit-button")).click();
	
		driver.findElement(By.xpath("//*[text()='Our Brands']")).click();
	
		JavascriptExecutor executor = (JavascriptExecutor)driver;	
	executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[text()='4 Stars & Up']")));
		driver.findElement(By.xpath("//*[@id='nav-progressive-subnav']/div/a[6]")).click();
		driver.findElement(By.id("searchDropdownBox")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='search-alias=baby-products']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='nav-belt']/div[2]/div/form/div[2]/div[1]/input")).sendKeys("cribs");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.id("a-autoid-0-announce")).click();
		driver.findElement(By.xpath("//a[text()='Price: Low to High']")).click();
		Thread.sleep(2000);
		//	System.out.println("xpath of this is " + driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']")));
		List<WebElement> element = driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		System.out.println("The size of all the items is " + element.size());
		int j = 0;
		
		for(int i =0;i<element.size();i++)
		{
			element.get(i).getText();
			
			
					 j++;
					// driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']")).get(i).click();
					// wb.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
	System.out.println("baby crib net"  + element.get(i).getText().equals("BabyKing Crib Net"));
					 if(element.get(i).getText().equals("BabyKing Crib Net"))
					 {
						 driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']")).get(i).click();
						 break;
					 }

		
				
			}
		

	}

}
