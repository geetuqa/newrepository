
public class reverse {

	public static void main(String[] args) {
		String name = "Puneet Verma";
		String value;

		
		for(int i = name.length()-1;i>=0;i--)
		{
		value = Character.toString(name.charAt(i));
		System.out.print( value);
		}

	}

}
