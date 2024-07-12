package sDET;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateByHashSet {

	public static void main(String[] args)
	{
		String Infra[]= {"Amazon", "Flipkart", "AWS", "GCP","Flipkart", "AWS", "GCP"};
		//Integer intr[]= {1,1,2,2,3,4,5,5,6,6,6,7,8,9,0};
		
		Set<String> data= new HashSet<String>();
		for(String s:Infra)
		{
			if (data.add(s)==false)
			{
				System.out.println("Duplicate elements is " +s);
			}
		}



	}

}
