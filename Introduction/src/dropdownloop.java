import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class dropdownloop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//aarav//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
	//	driver.get("file:///Users/aarav/Downloads/SpiceJetDropDowntest.html");
	    driver.findElement(By.id("divpaxinfo")).click();
	  
	
	    
WebElement a =  driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
	    
	 
    Select ab = new Select(a);
	    
	    //ab.getOptions();
	    //ab.size();
	 
	   int totsize = ab.getOptions().size();
	    
	    System.out.println("hello " + totsize);
		
		for (int i = 1;i<totsize;i++)
		{
			
		    ab.selectByIndex(i);
		  	
			
		}
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		//driver.findElement(By.xpath("//span[text()= 'Check-In']")).click();
		//System.out.println("outside the loop" + ab.getFirstSelectedOption().getText());
	

	}

}
