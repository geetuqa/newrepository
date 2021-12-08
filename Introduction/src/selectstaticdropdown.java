import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectstaticdropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//aarav//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement wb = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(wb);
	   // dropdown.selectByIndex(2);
	   // System.out.println("aaaaaaaa----"  + dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println("by value-----" + dropdown.getFirstSelectedOption().getText());
		//dropdown.selectByVisibleText("USD");
		//System.out.println("visibletext is -------" + dropdown.getFirstSelectedOption().getText());
		
		
		
		if("USD".equals(dropdown.getFirstSelectedOption().getText()))

		{
			//dropdown.click();   
		System.out.println("in the if block");
		
			}
		else
		{
			System.out.println("in the else block");
		}
		
		//System.out.println("Deselected by index -------" + dropdown.getFirstSelectedOption().getText());

	}

}
