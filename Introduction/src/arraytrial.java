
public class arraytrial {

	public static void main(String[] args) {

		int arr[] = {2,7,5,4,9,8};
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("even no.'s are " +  arr[i]);
			}
			else if(arr[i]%2!=0)
			{
				System.out.println("odd no.'s are " +  arr[i]);
			}
		}
		
		
	}

}
