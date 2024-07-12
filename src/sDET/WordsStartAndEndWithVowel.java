package sDET;

import java.util.ArrayList;
import java.util.List;

public class WordsStartAndEndWithVowel {

	public static void main(String[] args) {
		String input= "It assists hospitals and clinicians in improving their quality "
				+ "and patient safety performance, as well as allowing registries to manage "
				+ "and analyze their practices and clinicians' performance";
		String [] splitWords=input.toLowerCase().split("\\s+");
		List <String> wordsStartandEndWithVowel=new ArrayList<String>();
		
		for (String word: splitWords)
		{
			if (getWordStartAndEndWithVowel(word))
			{
				wordsStartandEndWithVowel.add(word);
			}
		}
		
		System.out.println("Words start and end with vowel from given input is/are "+ wordsStartandEndWithVowel);
	}
	
	public static boolean getWordStartAndEndWithVowel(String word)
	{
		if (word.isEmpty())
		{
			return false;
		}
		
		char firstChar=word.charAt(0);
		char lastChar=word.charAt(word.length()-1);
		
		return isVowel(firstChar)&& isVowel(lastChar);
		
		
	}
	
	public static boolean isVowel(char ch)
	{
	
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';

	}

}
