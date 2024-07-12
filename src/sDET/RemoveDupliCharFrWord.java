package sDET;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupliCharFrWord {

	public static void main(String[] args) {
		//String input= "hexaware";
	removeDuplicateCharacter("onkar");
	}
	
	public static void removeDuplicateCharacter(String input)
	{
		System.out.println("given string is " +input);
		Set<Character> seen= new HashSet<Character>();
		StringBuilder sb= new StringBuilder();
		
		for(char c :input.toCharArray())
		{	
			if(seen.add(c))
			{
				sb.append(c);
			}
		}
		System.out.println("String without duplicate character is "+ sb.toString());

	}

}
