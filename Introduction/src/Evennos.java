
public class Evennos {

	public static void main(String[] args) {
	
//		1. Take an input 'num' variable value and initialize a variable 'fact' with value '1'
//		2. Multiply the fact variable value with 'num' variable value and assign results to 'fact' variable value
//		3. Decrement the 'num' variable value to 1
//		4. Repeat the step 2 to 3 until the 'num' variable value is greater than zero


		int num=5;
		
		int factorial = 1;
		
		for(int i=num;i>0;i--)
		{
			factorial = factorial*i; 
			
		}
		System.out.println("The factorial of "  + num + " is " + factorial);
		
	}
}


	


