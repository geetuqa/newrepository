package practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class userInput {

    public static Date dateStart;
	static Date dateEnd;
	static String vehicleName;
	public static Scanner scanner = new Scanner(System.in);
	
	public static void allUserInputs() throws ParseException
	{
		System.out.println("Enter your start journey date : yyyy-MM-dd");
	    String date = scanner.nextLine();
	    
	    String pattern = "yyyy-MM-dd";
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

	    dateStart = simpleDateFormat.parse(date);
	    
	    System.out.println(dateStart);
	    System.out.println("Enter your end journey date : yyyy-MM-dd");
	    String date1 = scanner.nextLine();
	
	    dateEnd = simpleDateFormat.parse(date1);
	
	    System.out.println(dateEnd);
	    
	    selectVehicleType();
	   
	    scanner.close();
	}
	

	
	public static void selectVehicleType()
	{
		System.out.println("Available Vehicles are Car,Jeep,7 seater,Van");
		System.out.println("Enter your Vehicle Selection : ");
	    vehicleName = scanner.nextLine();System.out.println("Selected Vehicle : " + vehicleName); 
	}
	
}
