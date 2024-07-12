package string_manipulations;

import java.util.HashSet;
import java.util.Set;



public class RemoveDuplicates {

	public static void main(String[] args) {
		// aproach-1
		String given = "OnkaKirtiBargaje";
		String input = given.toLowerCase();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			System.out.println(c);
			int index = input.indexOf(c, i + 1);
			// System.out.print(index);
			if (index == -1) {
				sb.append(c);
			}

		}
		System.out.println(sb);

		System.out.println("-----------------------------------------------------");
		// aproach-2
		StringBuilder sb2 = new StringBuilder();
		char[] charArray = input.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			boolean reapeted = false;
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] == charArray[j]) {
					reapeted = true;
					break;
				}
			}
			if (!reapeted) {
				sb2.append(charArray[i]);
			}

		}
		System.out.println(sb2);
		
		System.out.println("-----------------------------------------------------");
		StringBuilder sb3 = new StringBuilder();
		Set<Character> data= new HashSet<Character>();
		char[] charArray1 = input.toCharArray();
		for(char e:charArray1)
		{
			if(data.add(e)==true)
			{
				sb3.append(e);
				System.out.println(e);
				//String oute=String.valueOf(e);
				//System.out.println(oute);
			}
		}

	}

}
