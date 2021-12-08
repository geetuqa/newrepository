import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//aarav//Downloads//chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.yahoo.com/");
	//	driver.findElement(By.id("email")).sendKeys("Geetu");
	//	driver.findElement(By.name("pass")).sendKeys("Hellothere");	
	//	System.out.println("login button" + driver.findElement(By.name("login")));
	//	driver.findElement(By.name("login")).click();
	//	//driver.findElement(By.id("loginbutton")).click();
	//	driver.close();
	
		driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
		//System.out.println("current page "  + driver.getCurrentUrl());
		
       Thread.sleep(3000);
      //  driver.navigate().to("https://mail.yahoo.com/");
		driver.findElement(By.name("username")).sendKeys("Puneet");
		//System.out.println("aaaaaaaaa"  + driver.findElement(By.name("signin")));
		driver.findElement(By.xpath("//*[@id=\'login-signin\']")).click();
		
		
	
	}

}

