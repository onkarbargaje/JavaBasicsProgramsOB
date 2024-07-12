package sDET;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountSpecificWordsInString {

	public static void main(String[] args) 
	{
		String s1= "Registry businesses in US healthcare are\r\n"
				+ "centralized databases or repositories that store\r\n"
				+ "and manage patient-related data, medical\r\n"
				+ "records, and other healthcare information. These\r\n"
				+ "registries serve various purposes, including\r\n"
				+ "tracking patient demographics, medical histories,\r\n"
				+ "treatment outcomes, and disease prevalence.\r\n"
				+ "They are essential for healthcare providers,\r\n"
				+ "researchers, policymakers, and public health";
		
        String inputLowerCase=s1.toLowerCase();
		
		String[] inputSplitWords=inputLowerCase.split("\\s+");
		
		String[] wordsToCount ={"healthcare", "and"};
		
		Map<String,Integer> wordCountMap= new HashMap<String, Integer>();
		
		for(String e: wordsToCount)
		{
			wordCountMap.put(e, 0);
		}
		//System.out.println(wordCountMap);
		
		for(String f: inputSplitWords)
		{
			if(wordCountMap.containsKey(f))
			{
				wordCountMap.put(f, wordCountMap.get(f)+1);
			}
		}
		System.out.println(wordCountMap);
		

	}

}
