package Seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singleSelectionDropBox {

	public static void main(String[] args) {
	/*	Single Selection DropDown Box Assignment 
		Write a selenium Webdriver program to print the number of additional options listed and number of expected
	    options not listed in a single selection List box
		If expected options count is less than actual options count then
		Print the extra options listed
		else If expected options count is greater than actual options count then
	    Print the missed options listed
   */  		String allOptions;
   			String firstddoptions;
   			String secondddoptions;
   			String thirdddoptions;
   			String fourthddoptions;
   			String fifthddoptions;
   			
   			String storeval="";
   			String storeval1="";
   			String storeval2="";
   			String storeval3="";
   			String storeval4="";
		 	System.setProperty("webdriver.chrome.driver","//Users//aarav//eclipse-workspace//Selenium//Drivers//chromedriver4" );
			
			WebDriver driver = new ChromeDriver();
			driver.get("http://leafground.com/pages/Dropdown.html");
	        driver.manage().window().maximize();
	        WebElement selBox1 = driver.findElement(By.xpath("//select[@id='dropdown1']"));
	        List<WebElement> selFirstDD = driver.findElements(By.xpath("//select[@id='dropdown1']/option"));
	      //  List<WebElement> selBox1 = driver.findElements(By.tagName("option"));
	        WebElement selBox2 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
	        List<WebElement> selSecondDD = driver.findElements(By.xpath("//select[@name='dropdown2']/option"));
		
	        WebElement selBox3 = driver.findElement(By.xpath("//select[@id='dropdown3']"));
	        List<WebElement> selThirdDD = driver.findElements(By.xpath("//select[@id='dropdown3']/option"));
	        
	        WebElement selBox4 = driver.findElement(By.xpath("//select[@class='dropdown']"));
	        List<WebElement> selFourthDD = driver.findElements(By.xpath("//select[@class='dropdown']/option"));
	        
	        WebElement selBox5 = driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/parent::select"));
	        List<WebElement> selFifthDD = driver.findElements(By.xpath("//option[text()='You can also use sendKeys to select']/parent::select/option"));
	        
	        selSecondDD.addAll(selThirdDD);
	        selSecondDD.addAll(selFourthDD);
	        selSecondDD.addAll(selFifthDD);
	       
	        int noOfEle = selFirstDD.size();
	        int noOfEle1 = selSecondDD.size();
	        int noOfEle2 = selThirdDD.size();        
	        int noOfEle3 = selFourthDD.size();        
	        int noOfEle4 = selFifthDD.size();
	  
	        List<WebElement> selBoxAll = driver.findElements(By.tagName("option"));
	        
	        int noOfTotalEle = selBoxAll.size();

	        if(noOfTotalEle==4)
				System.out.println("The expected 4 options are listed in first DDB");
			else if(noOfTotalEle>4)
				System.out.println("The options are listed in first DDB are more than 4 expected count -  options count :: "+noOfTotalEle);
			else if(noOfTotalEle<4)
				System.out.println("The options are listed in first DDB are less than 4 expected count -options count :: "+noOfTotalEle);
	        System.out.println("first size" + selFirstDD.size());
	        System.out.println("second size" + selSecondDD.size());
	        System.out.println("----------------------------------------");
	        
	        for(WebElement ele :selFirstDD )
	        {
	        	if(selSecondDD.contains(ele))
	        	{
	        		System.out.println("VALUE EXISTS "+ele.getText());
	        	}
	        	else
	        	{
	        		System.out.println("NOT EXISTS "+ele.getText());
	        	}
	        }
	        /*for(int i=0;i<selFirstDD.size();i++)
	        {
	        	System.out.println("FIrst drop down values--- "+selFirstDD.get(i).getText());
	        	
	        	if(selSecondDD.contains(selFirstDD.get(i).getText()))
	        	{
	        		System.out.println("VALUE EXISTS");
	        	}
	        	else
	        	{
	        		System.out.println("NOT EXISTS");
	        	}
	        	
	        }*/
	        System.out.println("----------------------------------------");
	        
	        for(int i = 0;i<noOfEle;i++)
	        {

	        	firstddoptions = selFirstDD.get(i).getText();
	        	secondddoptions = selSecondDD.get(i).getText();
	        	thirdddoptions  = selThirdDD.get(i).getText();
	        	fourthddoptions  = selFourthDD.get(i).getText();
	        	fifthddoptions  = selFifthDD.get(i).getText();
	       // 	allOptions = selBoxAll.get(i).getText();
	   
	          	    if(!firstddoptions.equals(secondddoptions))
		        		{ 
			        		storeval = firstddoptions;
		        		}
	        	  	    if(!secondddoptions.equals(thirdddoptions))
		        		{ 
			        		storeval1 = secondddoptions;
		        		}
	        	  	  if(!thirdddoptions.equals(firstddoptions))
		        		{ 
			        		storeval2 = thirdddoptions;
		        		}
	        	  	if(!fourthddoptions.equals(thirdddoptions))
	        		{ 
		        		storeval3 = fourthddoptions;
	        		}
	        	  	if(!fifthddoptions.equals(fourthddoptions))
	        		{ 
		        		storeval4 = fifthddoptions;
	        		}
	            
	            
	        }
	  /*      System.out.println("in equal--------" + storeval);
	        System.out.println("in equal--------" + storeval1);
	        System.out.println("in equal--------" + storeval2);
	        System.out.println("in equal--------" + storeval3);
	        System.out.println("in equal--------" + storeval4);
	   */     
	}

}
