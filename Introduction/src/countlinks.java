import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countlinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "//Users//aarav//Downloads//chromedriver");

		WebDriver wb = new ChromeDriver();
		wb.get("http://qaclickacademy.com/");
		wb.findElement(By.xpath("//a[text()='Practice']")).click();
		//count the number of links on the page
		System.out.println("aaaaaaaaa" + wb.findElements(By.tagName("a")).size());
		WebElement element = wb.findElement(By.cssSelector("div[class= ' footer_top_agile_w3ls gffoot footer_style']"));
		System.out.println(element.findElements(By.tagName("a")).size());
		WebElement columndr  = element.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndr.findElements(By.tagName("a")).size());
 /*JavascriptExecutor js = (JavascriptExecutor)wb;
 js.executeScript("window.scrollby(0,500)");
 js.executeScript("document.querySelector('tablefixHead').scrollTop=5000");
 DesiredCapabilities ch = Desiredcapabilities.chrome();
 ch.acceptinsecureCerts();
 *
 */
	}

}

