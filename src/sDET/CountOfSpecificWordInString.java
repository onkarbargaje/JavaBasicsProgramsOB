package sDET;

public class CountOfSpecificWordInString {

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
		
		String[] words=inputLowerCase.split("\\s+");
		
		String expWordCount= "and";
		
		int count=0;
		
		for(String e: words)
		{
			if(e.equalsIgnoreCase(expWordCount))
			{
				count++;
				
			}
		}
		System.out.println("count of "+ expWordCount + " is/are " + count );

	}

}
