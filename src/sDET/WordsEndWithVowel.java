package sDET;

import java.util.ArrayList;
import java.util.List;

public class WordsEndWithVowel {

	public static void main(String[] args) {
		String input= "It assists hospitals and clinicians in improving their quality "
				+ "and patient safety performance, as well as allowing registries to manage "
				+ "and analyze their practices and clinicians' performance";
		
		String [] splitWords=input.toLowerCase().split("\\s+");
		List <String> wordsEndWithVowel= new ArrayList<String>();
		
		for (String word:splitWords)
		{
			if(getWordWithLastCharacterVowel(word))
			{
				wordsEndWithVowel.add(word);
			}
		}
		System.out.println("words ending with vowel are " +wordsEndWithVowel);

	}
	
	public static boolean getWordWithLastCharacterVowel(String word)
	{
		if (word.isEmpty())
		{
			return false;
		}
		char lastChar=word.charAt(word.length()-1);
		
		return lastChar == 'a'|| lastChar == 'e'|| lastChar == 'i'||lastChar == 'o'||  lastChar == 'u'; 
	}

}
