package sDET;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) 
	{
		 String s1= "Kierti Onkar Bargaje";
		   char[] charArray=s1.toCharArray();
		   
		 Map<Character,Integer> charCountMap= new HashMap<Character,Integer>();

      for (char c:charArray)
      {
    	  if(charCountMap.containsKey(c))
    	  {
    		  charCountMap.put(c, charCountMap.get(c)+1);
    	  }
    	  else
    	  {
    		  charCountMap.put(c, 1);
    	  }
      }
      System.out.println(charCountMap);
}
}
