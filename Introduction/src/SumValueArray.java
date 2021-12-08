import java.util.Scanner;

public class SumValueArray {

	public static void main(String[] args) {
	
		
	//	Find the largest and smallest numbers from the array list of values
	 //   Input :: int b[] = {34, 43, 2, 6, 9, 22, 3};
	  //      Output :: Smallest = 2
	   //           Greatest = 43
		
		int b[] = {34, 43, 2, 6, 9, 22, 3};
		int smallest = b[0];
		int largest = b[0];
		for(int i=0;i<b.length;i++)
		{
			if(b[i]<smallest)
			{
				smallest=b[i];
			}
		}
		System.out.println(smallest);
	
	}
	

}
