package practice;

import java.util.concurrent.TimeUnit;

public class calculateTotalCost 
{
		
	 long costPerKm;
	 long minRate   = 100;
     long totCost;
     
		 	public calculateTotalCost() 
		    {
				 String vehSelected  = userInput.vehicleName;
				 if(vehSelected.equalsIgnoreCase("Car"))
				 {
					  costPerKm = 2;
				 }
				 else if(vehSelected.equalsIgnoreCase("Jeep"))
				 {
					  costPerKm = 3;
				 }
				 else if(vehSelected.equalsIgnoreCase("7 seater"))
				 {
					  costPerKm = 4;
				 }
				 else if(vehSelected.equalsIgnoreCase("Van"))
				 {
					  costPerKm = 5;
				 }
		    }
		 	
			
		 	public void calculation()
			{
				
				long diffInMillies = Math.abs(userInput.dateEnd.getTime() - userInput.dateStart.getTime());
				 long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
				 System.out.println("No of days vehicle hired: " + diff + " days");
				 totCost = costPerKm * minRate * diff;
				 
				 System.out.println("Total cost of " + diff  + " days" + ":" + "$" + totCost);
	
		    }
}