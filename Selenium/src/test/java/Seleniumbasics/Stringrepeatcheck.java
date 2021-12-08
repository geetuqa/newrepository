package Seleniumbasics;

public class Stringrepeatcheck {
	static String word="Parallel";
	static int count=1;
	public static void main(String[] args) {
		
		
		int wordlen = word.length();
		//System.out.println("the length of the word is " + wordlen);
	//	String firstchar[0] = "P" ; 
		for(int i=0;i<wordlen;i++)
		{
				for(int j=i+1;j<wordlen;j++)
				{
					if(word.charAt(i)==word.charAt(j))
					{
						count++;
					}
				}	
			//	System.out.println("count " + count);
				if(count>1)
				{
					System.out.println(word.charAt(i) + " is repeated " + count + " times");
					count=1;
					
				}		
				
		}
			
				
		}
		

	}


