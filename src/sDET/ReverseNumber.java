package sDET;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ReverseNumber 
{

	public static void main(String[] args) 
	{
		/*
		 * Scanner sc= new Scanner (System.in); 
		 * System.out.println("Enter the number");
		 * int num=sc.nextInt();
		 * 
		 * StringBuffer sb= new StringBuffer(String.valueOf(num)); StringBuffer rev
		 * =sb.reverse(); System.out.println("The reverse number is "+ rev);
		 */
		
		String s= "ONKAR BARGAJE";
		
		//char s1=s.charAt(0);
        //IntStream s1=s.chars();
		//String s1=s.concat("  Bargaje");
		//boolean s1=s.contains("OK");
		//String s1=s.substring(2);
		String s1=s.substring(0, 5);
		s.split(s);
		System.out.println(s1);
		

	}

}
