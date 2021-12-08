
	interface A
	{
		int a = 10;
		void display();
	}
	interface B
	{
		int b = 20;
		void show();
	}
	
	
	
public class interfacetry implements A,B
{
	public void display()
	{
		System.out.println("interface a is displayed");
	}
	public void show()
	{
		System.out.println("interface b is shown");
	}
	
			public static void main(String[] args) {
					
					interfacetry obj = new interfacetry();
					obj.display();
					obj.show();
					
					
	}

}
