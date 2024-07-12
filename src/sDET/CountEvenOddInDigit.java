package sDET;

public class CountEvenOddInDigit {

	public static void main(String[] args)
	{
		int a= 12345;
		
		
		int odd= 0;
		//int odd; will get Error: Unresolved compilation problems: 
		//The local variable odd may not have been initialized
		int even=0;
		
		while(a>0)
		{
			int rem= a%10; // 12345%10=5
			if (rem%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			a=a/10;
			
		}
System.out.println("Count of odd number is "+odd);
System.out.println("Count of even number is "+even);
	}

}
