package sDET;

import java.util.HashSet;
import java.util.Set;

public class CheckDuplicateCharInWord {

	public static void main(String[] args) 
	{
		String input= "kirt";
		boolean hasDuplicateCharacter=false;
		Set<Character> seen= new HashSet<Character>();
		for(char c: input.toCharArray())
		{
			if(!seen.add(c))
			{
			 hasDuplicateCharacter=true;
			 break;
			}
		}
		
		if(hasDuplicateCharacter==true)
		{
			System.out.println("word has duplicate characters");
		}
		else
		{
			System.out.println("word has not duplicate character");
		}

	}

}
