package sDET;

import java.util.Scanner;

public class CountOfWordInString {

	public static void main(String[] args)
	{
          System.out.println("Please enter the string");
          Scanner sc= new Scanner(System.in);
          String s=sc.nextLine();
          String[] st=s.split("\\s+");
         System.out.println(st.length);
          //System.out.println(s.split("\\s+"));
          int count=1;
          for (int i=0; i<s.length()-1; i++)
          {
             if ((s.charAt(i)==' ') && (s.charAt(i+1)!= ' '))
             {
            	count++; 
             }

	}
          System.out.println("The number of words in string is  " + count);

}
}
