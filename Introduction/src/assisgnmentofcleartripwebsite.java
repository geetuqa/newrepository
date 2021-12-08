import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assisgnmentofcleartripwebsite {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "//Users//aarav//Downloads//chromedriver");

		WebDriver wb = new ChromeDriver();
		wb.get("https://www.cleartrip.com");

		Select adultsdropdown = new Select(wb.findElement(By.id("Adults")));
		Select childdropdown = new Select(wb.findElement(By.id("Childrens")));

		adultsdropdown.selectByIndex(2);
		childdropdown.selectByIndex(1);

		wb.findElement(By.id("DepartDate")).click();
		wb.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();

		wb.findElement(By.id("MoreOptionsLink")).click();

		wb.findElement(By.id("AirlineAutocomplete")).sendKeys("Vistara");

		System.out.println(wb.findElement(By.id("homeErrorMessage")).getText());
		wb.findElement(By.id("SearchBtn")).click();

	}
}
