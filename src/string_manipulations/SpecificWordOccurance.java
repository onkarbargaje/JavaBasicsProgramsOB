package string_manipulations;

import java.util.HashMap;
import java.util.Map;

public class SpecificWordOccurance {

	public static void main(String[] args)
	{
		String input="Registry businesses in US healthcare are\r\n"
				+ "centralized databases or repositories that store\r\n"
				+ "and manage patient-related data, medical\r\n"
				+ "records, and other healthcare information. These\r\n"
				+ "registries serve various purposes, including\r\n"
				+ "tracking patient demographics, medical histories,\r\n"
				+ "treatment outcomes, and disease prevalence.\r\n"
				+ "They are essential for healthcare providers,\r\n"
				+ "researchers, policymakers, and public health\r\n"
				+ "organizations to monitor and improve healthcare\r\n"
				+ "quality, safety, and population health. Registry\r\n"
				+ "businesses play a critical role in advancing\r\n"
				+ "evidence-based medicine, supporting clinical\r\n"
				+ "research.";
		Map<String,Integer>wordCount= new HashMap<String,Integer>();
		
		String [] strArray=input.split("\\s+");
		
		for(String e:strArray)
		{
			e=e.toLowerCase();
			System.out.println(e);
			if(wordCount.containsKey(e))
			{
				wordCount.put(e, wordCount.get(e)+1);
				
			}
			else
			{
				wordCount.put(e, 1);
			}
			
			
		}
		System.out.println(wordCount);

	}

}
