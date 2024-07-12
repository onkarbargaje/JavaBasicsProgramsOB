package sDET;

import java.util.ArrayList;
import java.util.List;

public class PracticeInterview {

	public static void main(String[] args)
	{
		String sent= "Onkar Kirti enum qwer";
		
		String [] words=sent.toLowerCase().split("\\s+");
		
		List <String> output= new ArrayList<String>();
		
		for(String word:words )
		{
			if(wordStartWithVowel(word))
			{
				output.add(word);
			}
		}
		System.out.println(output);
	}
	
	public static boolean wordStartWithVowel(String input)
	{
		if(input.isEmpty())
		{
			return false;
		}
		
		char firstChar=input.charAt(0);
		return firstChar == 'a' || firstChar == 'e' ||firstChar == 'i' ||firstChar == 'o' ||firstChar == 'u';
	}
	
	

}
