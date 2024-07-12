package sDET;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) 
	{
		
		int [] input= {1,2,3,3,4,5,6};
		
		int search_element= 3;
		boolean flag= false;
		
		for (int i=0; i<input.length; i++)
		{
			if(input[i]==search_element)
			{
				System.out.println( search_element +" Element is found at position "+i);
				flag= true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println(search_element +" Element is not found in given array");
		}
		
	}

	
}

