
		 class Parent
		{
			int a;
			int b;
			public  void addtwonos()
			{
				
				System.out.println("Sum of two nos " + a + b);
			}
		}
		class Base extends Parent
		{
			int c;
			public  void show()
			{
				
				System.out.println("in the base class" + b + " " + c);
			}
		}
		
public class inheritancepractice {
	
	public static void main(String[] args) {
		
		Base classb = new Base();
		classb.a=10;
		classb.b=20;
		classb.c=30;
		classb.addtwonos();
		classb.show();
	
		
		
		
	}

}
