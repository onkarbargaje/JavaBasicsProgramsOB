package sDET;

public class ReverseWordsInSentence {
	
	public static void main(String[] args)
	{
		String input="It assists hospitals and clinicians in improving their quality and patient "
				+ "safety performance, as well as allowing registries to manage and analyze their practices"
				+ " and clinicians' performance";
		String words[]=input.split(" "); //IMP is space
		
		
		for (int i=words.length-1;i>=0; i--)
		{
			System.out.print(words[i]+ " ");
		}
		
	}

}
