package sDET;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsStartWithVowel {
	
	public static void main(String[] args) {
		String input= "It assists hospitals and clinicians in improving their quality "
				+ "and patient safety performance, as well as allowing registries to manage "
				+ "and analyze their practices and clinicians' performance";
		
		String [] words=input.toLowerCase().split("\\s");
		//List <String> wordsWithStartVowel = new ArrayList<String>();
		Set <String> wordsWithStartVowel = new HashSet<String>();
		
		for(String ArrayWord: words)
		{
			if(wordStartWithVowel(ArrayWord))
			{
				//wordsWithStartVowel.add(ArrayWord);
				wordsWithStartVowel.add(ArrayWord);
			}

		}
		System.out.println("word start with vowel are "+ wordsWithStartVowel);
		
	}
	
	public static boolean wordStartWithVowel(String word)
	{
		if (word.isEmpty())
		{
			return false;
		}
		char firstChar=word.charAt(0);
        return firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u';

	}

}
