package sDET;

public class VowelsConsonantsCount {

	public static void main(String[] args) {
		String input="abcdeiajsktuoq";
		int vowels=0;
		int consonants=0;
		
		
	   for(int i=0; i<input.length(); i++)
	   {
		   char ch=input.charAt(i);
		   boolean isVowel= (ch== 'a') || (ch== 'e')|| (ch== 'i')|| (ch== 'o')|| (ch== 'u');
		    if(isVowel)
		    {
		    	vowels++;
		    }
		    else
		    {
		    	consonants++;
		    }
		   
		   
	   }
	   System.out.println("count of vowels and consonants is  " +vowels+ " and "+ consonants + " respectively");

	}

}
