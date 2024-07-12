package sDET;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please number to get its table");
		int n=sc.nextInt();
		
		for (int i=1; i<=10; i++)
		{
			int b=i*n;
			System.out.println(b);
		}
		
		
	}

}
