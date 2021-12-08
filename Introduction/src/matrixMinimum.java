
public class matrixMinimum {

	public static void main(String[] args) {
		int abc[][] = {{5,7,1},{2,6,3},{4,9,8}};
		int min = abc[0][0];
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			
				if(abc[i][j]<min)
				{
					min=abc[i][j];
				}	
		    }
			
			
		}
		System.out.println(min);

	}

}
