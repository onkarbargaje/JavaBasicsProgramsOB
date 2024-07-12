package string_manipulations;

public class RemoveSpecialCharacter {

	public static void main(String[] args) 
	{
		String input="How? are you!";
		String [] words=input.split("[ !?]+");
		System.out.println(words);
		for(int i=0; i<words.length;i++)
		{
			System.out.println("words["+i+"]" +words[i] );
		}

	}

}
