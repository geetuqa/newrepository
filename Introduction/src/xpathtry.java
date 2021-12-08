
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathtry {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//aarav//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//driver.get("https://facebook.com");
		//driver.findElement(By.xpath("//*[@name='email']")).sendKeys("geetschopra");
		//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123456");
		//driver.findElement(By.xpath("//*[@value='1']")).click();
		//driver.findElement(By.cssSelector("input[name='email'")).sendKeys("geets");
		//driver.findElement(By.cssSelector("[value='1'")).click();
//driver.findElement(By.cssSelector("a[class='signin']")).click();
	/*	driver.findElement(By.cssSelector("a[class='signin']")).click();
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("puneetverma");
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
		/*driver.findElement(By.xpath("//input[contains(@value,'Sign')]")).click();
		driver.findElement(By.xpath("//input[@id='ct100_mainContent_btn_FindFlights']")).click();
		 absolute path driver.findElement(By.xpath("//html[1]/body[1]/form[1]/div[4]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[3]/div[1]/div[14]/span[1]/input[1]")).click();
       
		driver.findElement(By.xpath("//body[1]/form[1]/div[4]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[3]/div[1]/div[14]/span[1]/input[1]")).click();
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		driver.findElement(By.xpath("//body[1]/form[1]/div[4]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[3]/div[1]/div[12]/span[1]/a[1]")).click();*/
       //driver.findElement(By.xpath("//a[text()= 'Special Assistance']")).click();
		System.out.println("new window");		
		
	}

}
