package sDET;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Practice2 {
	
	

	public static void main(String[] args) 
	{	
		int input= 12345;
		int output=0;
		
		while(input!=0)
		{
			output=output*10+input%10;
			input=input/10;
		}
   
       System.out.println(output);
	}
	
}
	




