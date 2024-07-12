package sDET;

import java.util.Arrays;

public class SortTheArray {

	public static void main(String[] args) 
	{
		int [] input= {10,11,45,23,67,332,89,112,1};
		
		int temp;
		
		for (int i=0; i<input.length; i++)
		{
			for (int j=i+1; j<input.length; j++)
			{
				if(input[i]>input[j])
				{
					temp=input[i];
					input[i]=input[j];
					input[j]=temp;
				}
			}
			System.out.print((input[i] +","));
		}
		

	}
	
	

}
