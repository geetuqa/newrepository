
public class calculation {

	int a;
	int b;
	int c;
	
calculation(int x,int y,int z)
{
	a=x;
	b=y;
	c=z;
}
void sum()
{
	int sumofnum;
	sumofnum = a+b+c;
	System.out.println("Sum of the three numbers" + sumofnum);
	
}
	
	public static void main(String[] args) {
		
		calculation calc = new calculation(10,20,30);
		calc.sum();
		

	}

}
