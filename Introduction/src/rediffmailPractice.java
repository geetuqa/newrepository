import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class rediffmailPractice {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","//Users//aarav//Downloads//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
       // driver.findElement(By.xpath("//body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[3]/td[3]/input[1]")).sendKeys("GAP");
		driver.findElement(By.xpath("//table[@class='f14']/tbody/tr[3]/td[3]/input")).sendKeys("GAP");
		driver.findElement(By.xpath("//table[@class='f14']/tbody/tr[7]/td[3]/input[1]")).sendKeys("gap");
		driver.findElement(By.xpath("//table[@class='f14']/tbody/tr[9]/td[3]/input")).sendKeys("gapgap@");
		driver.findElement(By.xpath("//table[@class='f14']/tbody/tr[11]/td[3]/input")).sendKeys("gapgap@");
		driver.findElement(By.cssSelector(".nomargin")).click();
		driver.findElement(By.xpath("//table[@class='f14']/tbody/tr[2]/td[3]/select/option[1]")).click();
		driver.findElement(By.xpath("//table[@class='f14']/tbody/tr[2]/td[3]/select/option[3]")).click();
		driver.findElement(By.xpath("//div[@id='div_hintQS']/table/tbody/tr[4]/td[3]/input")).sendKeys("Playing candycrush");
		driver.findElement(By.xpath("//div[@id='div_hintQS']/table/tbody/tr[6]/td[3]/input")).sendKeys("Kamal");
		driver.findElement(By.xpath("//div[@id='div_mob']/table/tbody/tr/td[3]/div[2]")).click();
		driver.findElement(By.xpath("//div[@id='country_id']/ul/li[1]")).click();
		driver.findElement(By.xpath("//div[@id='div_mob']/table/tbody/tr/td[3]/div[3]/input")).sendKeys("9815468662");
		driver.findElement(By.xpath("//td[text()='Date of Birth']/../td[3]/select[1]/option[1]")).click();
		driver.findElement(By.xpath("//td[text()='Date of Birth']/../td[3]/select[1]/option[10]")).click();
		driver.findElement(By.xpath("//td[text()='Date of Birth']/../td[3]/select[2]/option[1]")).click();
		driver.findElement(By.xpath("//td[text()='Date of Birth']/../td[3]/select[2]/option[4]")).click();
		driver.findElement(By.xpath("//td[text()='Date of Birth']/../td[3]/select[3]/option[1]")).click();
		driver.findElement(By.xpath("//td[text()='Date of Birth']/../td[3]/select[3]/option[4]")).click();		
		driver.findElement(By.xpath("//div[@id='div_city']/table/tbody/tr/td[3]/select//option[1]")).click();
		driver.findElement(By.xpath("//div[@id='div_city']/table/tbody/tr/td[3]/select/option[21]")).click();
		driver.findElement(By.id("Register")).click();
	}
}
