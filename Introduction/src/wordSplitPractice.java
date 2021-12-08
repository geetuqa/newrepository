
public class wordSplitPractice {

	public static void main(String[] args) {
		{
			String sentence = "This is the best career option ";
			String words[];

			
			words = sentence.split(" ");
			for(int i = 0;i<words.length;i++)
			{
				System.out.println( words[i]);
			}
			System.out.println("The length of the words are " + words.length);
		}

	}

}
