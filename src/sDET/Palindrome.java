package sDET;

import java.util.Scanner;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the number ");
		int num=sc.nextInt();
		
		StringBuffer sb= new StringBuffer(String.valueOf(num));
		StringBuffer revNum=sb.reverse();
	    System.out.println(revNum);
		
		if (sb==revNum)
		{
			System.out.println("The given number is palindrome");
		}
		else
		{
			System.out.println("The given number is not palindrome");
		}

	}

}
