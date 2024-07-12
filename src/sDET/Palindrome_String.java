package sDET;

import java.util.Scanner;

public class Palindrome_String 
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the any word");
		String inputString=sc.next();
		String rev= "";
		
		/*StringBuffer sb= new StringBuffer(inputString);
		StringBuffer reverseString=sb.reverse();
		System.out.println(reverseString); */
		int len=inputString.length();
		
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+inputString.charAt(i);
		}
		
		if (rev==inputString)
		{
			System.out.println("Input String "+ inputString   + " is palindrome string");
		}
		else {
			System.out.println("Input String "+ inputString + " is not palindrome string");
		}

	}

}
