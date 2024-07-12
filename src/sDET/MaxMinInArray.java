package sDET;

import java.util.Arrays;
import java.util.Collections;

public class MaxMinInArray {

	public static void main(String[] args) 
	{

          Integer [] array= {8,1,2,3,4,5, -89,6,7,8,9,0};
          
//          int max = Collections.max(Arrays.asList(array));
//          int min = Collections.min(Arrays.asList(array));
//          System.out.println(max);
//          System.out.println(min);
          
          
          int max= array[0];
          
          for (int i=0; i<array.length; i++)
          {
        	  if(array[i]>max)
        	  {
        		  max= array[i];
        	  }
          }
          System.out.println("maximum number from  given array is " +max);
          System.out.println("-------------------------------------------------");
          
          int min= array[0];
          
          for (int i=0; i<array.length; i++)
          {
        	  if(array[i]<min)
        	  {
        		  min= array[i];
        	  }
          }
          System.out.println("maximum number from  given array is " +min);

	}

}
