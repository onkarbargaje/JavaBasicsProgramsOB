package sDET;

import java.util.Arrays;

public class SecondLargestNumber
{
	
	
	public static void main(String[] args) 
	{       
		int[] arr= {55,44,11,22,77,99,74,198};
		int  temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if (arr[i]<arr[j]) //it will sort in ascending order
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			if(i==2) // it give 3 rd largest number
			{
				System.out.println(arr[i]);
				break;
			}
		}
     //  System.out.println("second larget number is "+ arr[1]);

	}

}
