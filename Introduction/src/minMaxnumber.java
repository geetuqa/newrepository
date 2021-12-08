
public class minMaxnumber {

	public static void main(String[] args) {
		
		int minMax[][]= {{2,4,5},{3,2,10},{1,2,0}};
	
	//	2  4  5 
	//	3  2  10
	//	1  2  0
		
		
		
		int min = minMax[0][0];
		int minColumn =0;
		//int max = 		int k =0;
		for(int i=0;i<3;i++)  // rows 
		{
			for(int j=0;j<3;j++) //columns
			{
				if(minMax[i][j]<min)
				{
					min=minMax[i][j];
					minColumn=j;
				}
				
					
				}
			}
		int max = minMax[0][minColumn];
		int k =0;
		while(k<3)
		{
			if(minMax[k][minColumn] > max)
			{
				max = minMax[k][minColumn];
			}
			k++;
		}
		System.out.println(max);
	}
}
