package sDET;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareTwoArray {

	public static void main(String[] args) 
	{

        ArrayList<String>l1= new ArrayList(Arrays.asList("B","A","B","C"));
        ArrayList<String>l2= new ArrayList(Arrays.asList("B","A","B","D"));
       Collections.sort(l1);
       Collections.sort(l2);
       
       System.out.println(l1.equals(l2));
	}

}
