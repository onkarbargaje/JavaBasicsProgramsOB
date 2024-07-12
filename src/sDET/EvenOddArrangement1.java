package sDET;

import java.util.Arrays;

public class EvenOddArrangement1 {
	
	public static void main(String[]args)
	{
	int [] input= {24,13,45,30,51,64};
	//Arrays.sort(input1);
	System.out.println("Original Array: " + Arrays.toString(input));
	//int [] result= new int [input.length];
	
	int left=0;
	int right= input.length-1;
	
	while(left<right)
	{
		while(input[left]%2==0 && left<right)
		{
			left++;
		}
		
		while(input[right]%2 != 0 && left<right)
		{
			right--;
		}
		
		if (left < right) {
            int temp = input[left];
            input[left] = input[right];
            input[right] = temp;

            left++;
            right--;
        }
	}
	System.out.println("Rearranged Array: " + Arrays.toString(input));
	
	}
	

   

}
