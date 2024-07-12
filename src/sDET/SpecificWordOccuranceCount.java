package sDET;

public class SpecificWordOccuranceCount {

	public static void main(String[] args)
	{
		String input= "It assists hospitals and clinicians in improving their quality "
				+ "and patient safety performance, as well as allowing registries to manage "
				+ "and analyze their practices and clinicians' performance";
		
		String [] words=input.toLowerCase().split("\\s+");
		String requiredCountOfWord= "and";
		int wordCount=0;
		
		for(int i=0; i<words.length; i++)
		{
			if(words[i].equalsIgnoreCase(requiredCountOfWord))
			{
				wordCount++;
			}
		}
		System.out.println("count of "+ requiredCountOfWord + " is/are " + wordCount);

	}

}
