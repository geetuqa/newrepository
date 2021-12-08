import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAssignment {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "//Users//aarav//Downloads//chromedriver");
		WebDriver wb = new ChromeDriver();
		wb.get("https://the-internet.herokuapp.com");  
		wb.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		wb.switchTo().frame("frame-top");
		wb.switchTo().frame("frame-middle");
		System.out.println("Middle " + wb.findElement(By.id("content")).getText());
		
	}

}
