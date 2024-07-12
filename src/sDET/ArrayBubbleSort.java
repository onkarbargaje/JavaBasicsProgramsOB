package sDET;

import java.util.Arrays;

public class ArrayBubbleSort {

	public static void main(String[] args) 
	{
		int [] input= {2,5,1,9,3};
		System.out.println("Array before sorting "+ Arrays.toString(input));
		int length=input.length;
		
		for (int i=0; i<length-1; i++) // no of pass
		{
			for(int j=i+1; j<length; j++)  // 
			{
				if(input[i]>input[j])
				{
					int temp= input[j];
					input[j]= input[i];
					input[i]= temp;
				}
			}
		}
		
		System.out.println("Array after sorting "+  Arrays.toString(input));

	}

}
