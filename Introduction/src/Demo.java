/*Write a java program to find the repeated characters in a string and print the number of times the respective characters are repeated

            Input :: String word ="initialization";

            Output ::

                i is repeated 5 times
                n is repeated 2 times
                a is repeated 2 times
                t is repeated 2 times
 */

public class Demo {

	public static void main(String[] args) {
		String name="initialization";
		String subStringName;
		
		
		int size = name.length();
		int length=0;
		
		String checkVal;
		String checkVal1="";
		int count=0;
		int count1=0;
		int count2=0;
		int count3=0;
		int co=0;
		int subStringofI;
		String aaa="";
		String subStringName12;
		
	
		for(int j=0;j<size;j++)
		{
			checkVal = Character.toString(name.charAt(j));
			subStringName = name.substring(j, size);
			subStringName12 = name.substring(j+1,size);
			System.out.println("length " + subStringName12);
			co = subStringName12.length();
			System.out.println("co   "   + co);
			if(co!=0)
			{
			aaa = Character.toString(name.charAt(co));
			}
				checkVal1 = aaa;
				System.out.println("checkVal1   "   + checkVal1);
				if((subStringName.startsWith(checkVal)) && (subStringName12.endsWith(checkVal1) || subStringName.startsWith(checkVal1) ))		
				{
					count++;
					
				}
				else if(subStringName.startsWith(checkVal))
				{
					count1++;
				}
		//		else if(checkVal1.startsWith(subStringName))
		//				{
		//			count2++;
		//				}
			
		
		
		//	if(checkVal.)
		//	{
				
		//			count++;
		//	}
	
			
	
		}	
	
		System.out.println("I is repeated "  + count + " times");
		System.out.println("N is repeated "  + count1 + " times");
	//	System.out.println("N is repeated "  + count1 + " times");
		System.out.println("A is repeated "  + count2 + " times");
		System.out.println("T is repeated "  + count3 + " times");
	//	

	}
	}

