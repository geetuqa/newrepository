import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAxes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "//Users//aarav//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		//self node
		String textValue = driver.findElement(By.xpath("//body[1]/div[2]/div[5]/table[1]/tbody[1]/tr[9]/td[1]/a[1]/self::a")).getText();
		System.out.println(textValue);
		
		//parent node		
		String textValueParent =driver.findElement(By.xpath("//body[1]/div[2]/div[5]/table[1]/tbody[1]/tr[9]/td[1]/a[1]/parent::td")).getText();	
		System.out.println(textValueParent);
		
		//child element
		List<WebElement> number = driver.findElements(By.xpath("//body[1]/div[2]/div[5]/table[1]/tbody[1]/tr[9]/td[1]/a[1]/ancestor::tr/child::td"));
	    System.out.println("the number of children" + number.size());
	    
	    //ancestor
	    textValue = driver.findElement(By.xpath("//body[1]/div[2]/div[5]/table[1]/tbody[1]/tr[9]/td[1]/a[1]/ancestor::tr")).getText();
	    System.out.println(textValue);
	    
	    //descedent
	    List<WebElement> descendants  = driver.findElements(By.xpath("//body[1]/div[2]/div[5]/table[1]/tbody[1]/tr[9]/td[1]/a[1]/ancestor::tr/descendant::*"));
	    System.out.println("print" + descendants.size());
	    
	    //following
	    List<WebElement> follow = driver.findElements(By.xpath("//body[1]/div[2]/div[5]/table[1]/tbody[1]/tr[9]/td[1]/a[1]/ancestor::tr/following::tr"));
	    System.out.println("follow" + follow.size());
	   
	    //following-sibling
	    List<WebElement> followsibling = driver.findElements(By.xpath("//body[1]/div[2]/div[5]/table[1]/tbody[1]/tr[9]/td[1]/a[1]/ancestor::tr/following-sibling::tr"));
	    System.out.println("followsibling" + followsibling.size());
	    
	  //preceding
	    List<WebElement> precede = driver.findElements(By.xpath("//body[1]/div[2]/div[5]/table[1]/tbody[1]/tr[9]/td[1]/a[1]/ancestor::tr/preceding::tr"));
	    System.out.println("precede" + precede.size());
	   
	    //preceding-sibling
	    List<WebElement> precedesibling = driver.findElements(By.xpath("//body[1]/div[2]/div[5]/table[1]/tbody[1]/tr[9]/td[1]/a[1]/ancestor::tr/preceding-sibling::tr"));
	    System.out.println("precedesibling" + precedesibling.size());
	  
	    
	    
	}
	
	//body[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]/parent::*/parent::*/parent::*/parent::*/child::div[4]

}
