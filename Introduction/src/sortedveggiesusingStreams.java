import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sortedveggiesusingStreams {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//aarav//Downloads//chromedriver");

		WebDriver wb = new ChromeDriver();
		
		wb.get("https://rahulshettyacademy.com/seleniumPractise/");

	}

}
