import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class asssignmentparentchild {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//aarav//Downloads//chromedriver");
		
														

		WebDriver wb = new ChromeDriver();
		
		wb.get("https://the-internet.herokuapp.com");
		
		wb.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		Thread.sleep(1000);
		wb.findElement(By.xpath("//a[text()='Click Here']")).click();
		Thread.sleep(1000);
		
		Set<String> whandle = wb.getWindowHandles();
		Iterator<String> it = whandle.iterator();
		String pClass = it.next();
		wb.switchTo().window(it.next());

		System.out.println(wb.findElement(By.xpath("//h3[text()='New Window']")).getText());
		wb.switchTo().window(pClass);
		System.out.println(wb.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
		


	}

}
