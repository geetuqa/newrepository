package practice;

import java.text.ParseException;

public class carRental {

	public static void main(String[] args) throws ParseException {
		
		userInput.allUserInputs();
		calculateTotalCost obj = new calculateTotalCost();
		long cost = obj.costPerKm;
		obj.calculation();

	}

}

