package sDET;

import java.util.Arrays;

public class AnagramsString {

	public static void main(String[] args) {
		
		  doCheckAnagramString("listen", "silent");

	}
	
	public static boolean doCheckAnagramString(String input1, String input2)
	{
		if(input1.length()!= input2.length())
		{
			System.out.println("given strings length is not same " +input1+ "," +input2);
			return false;
		}
		char[] c1=input1.toCharArray();
		char[] c2=input2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		//return Arrays.equals(c1, c2);
		boolean result =Arrays.equals(c1, c2);
		if(result)
		{
			System.out.println("given string are anagram " +input1+ "," +input2);
		}
		else
		{
			System.out.println("given string are not anagram " +input1+ "," +input2);
		}
		return result;
	}

}
