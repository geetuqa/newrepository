import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class namesstartingwithA {

	public static void main(String[] args) {
		ArrayList<String> names= new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Rahul");
		names.add("Ashok");
		names.add("Aarav");
		names.add("Puneet");
		names.add("Aradhana");
		names.add("Ajay");
		names.add("Harry");
		
		Long c = names.stream().filter(s->s.startsWith("A")).count();
	
		
		List<String> sl = Arrays.asList("Abhijeet","Ajay","Rama");
	    sl.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//Stream.of("Abhijeet","Ajay","Rama").filter(s->s.charAt(0)).sorted())
//		Stream.of("Abhijeet","Ajay","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
//		.forEach(s->System.out.println(s));
	System.out.println("names " + c);
/*		int count = names.size();
		
		for(int i = 0;i<count;i++)
		{
		       names.get(i);
		       if(names.get(i).startsWith("A"))
		       {
		       
		    	   System.out.println("names " + names.get(i));
		    
		       }
		}
		*/
	}

}
