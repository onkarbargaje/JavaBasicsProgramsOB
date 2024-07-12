package sDET;

import java.util.Arrays;

public class ShiftZeroToRightInArray {

	public static void main(String[] args) 
	{
		//int [] input= {0,1,3,0,0, 9,0,1,0,02,10,10};
		int [] input= {1,1,1,2};
		System.out.println(input.length);
		int [] output= new int[input.length];
		System.out.println(Arrays.toString(output));
		int count=input.length-1;
		//int count=0;
		for(int i=0;i<input.length; i++)
		{
			if(input[i]!=0)
			{
				output[count]=input[i];
				//count++;
				count--;
			}
			
		}
       System.out.println(Arrays.toString(output));
       System.out.println(output.length);
	}

}
