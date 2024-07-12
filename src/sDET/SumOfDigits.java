package sDET;

public class SumOfDigits {

	public static void main(String[] args)
	{
		int a= 9807548;
		int sum= 0;
		while(a>0)
		{
			int x=a%10;
			if(x!=0)
			{
				sum=sum+x;
			}
			a=a/10;
			
			
			
			
			
		}
		System.out.println("Sum of number is "+ sum);
	}

}
