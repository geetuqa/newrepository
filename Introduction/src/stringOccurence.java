
public class stringOccurence {

	public static void main(String[] args) {
		
		// Write a Java Program to sort the array values in an ascending order
	    //    Input :: int b[] = {34, 43, 2, 6, 9, 22, 3};
	    //    Output :: b[] = {2,3,6,9,22,34,43}
	
		int arr[]= {34, 43, 2, 6, 9, 22, 3};
//             		0   1  	2  3  4   5  6
		int temp = 0;
		for(int i =0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
				
			}
			System.out.println("the values in ascending order are " + arr[i]);
		}
	  
	}
}