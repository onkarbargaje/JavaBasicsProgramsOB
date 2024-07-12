package sDET;

import java.util.HashSet;
import java.util.Set;

public class RemoDupliCharFroSentence {

	public static void main(String[] args) {
		String in="kirti onkar bargaje";
		
		String[] words=in.split("\\s+");
		Set <Character> seen = new HashSet<Character>();
		Set <Character> duplicate = new HashSet<Character>();
		StringBuilder sb= new StringBuilder();
		for(String word: words)
		{
			for (char c:word.toCharArray())
			{
				if(!seen.add(c))
				{
					duplicate.add(c);
				}
			}
			
			for (char c:word.toCharArray())
			{
				if(!duplicate.contains(c))
				{
					sb.append(c);
				}
			}
		}
		
		
		System.out.println(sb.append(" ").toString());
		System.out.println(duplicate);
	}

}
