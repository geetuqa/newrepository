import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greenkart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "//Users//aarav//Downloads//chromedriver");

		WebDriver wb = new ChromeDriver();
		
		wb.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);

		List<WebElement> el = wb.findElements(By.cssSelector("h4.product-name"));
		String[] arrayNames = {"Cucumber","Beans","Brocolli","Apple","Brinjal","Musk Melon","Mango"};

		int j=0;
		for(int i = 0;i<el.size();i++)
		{
			 String[] name = el.get(i).getText().split("-");
			 String formatName = name[0].trim();
			 List<String> itemsneededlist = Arrays.asList(arrayNames);
			 if(itemsneededlist.contains(formatName))
			 {
				 j++;
				 wb.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				// wb.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				 if(j==arrayNames.length)
				 {
				 break;
				 }

		
			 }
		}
		
		

	}

}
