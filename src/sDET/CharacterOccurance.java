package sDET;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurance {

	public static void main(String[] args) {
		//String ab = "TestingOnkarOO";
		int a= 121234242;
	     String ab=Integer.toString(a);
       
		char[] c = ab.toCharArray();
		Map<Character, Integer> charCount = new HashMap<>();

		for (char d : c) {
			if (charCount.containsKey(d)) {
				charCount.put(d, charCount.get(d) + 1);
			} else {
				charCount.put(d, 1);
			}
		}
		System.out.println(charCount);

	}

}
