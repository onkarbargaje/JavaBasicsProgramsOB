package sDET;

public class ReturnKeyword 
{
	int add(int a,int b)
	{
		int c= a+b;
		return c;
	}

	public static void main(String[] args) 
	{
		ReturnKeyword r1= new ReturnKeyword();
		System.out.println(r1.add(10, 13));// we have to give entire method in sysout in case of retunr keyword

	}

}
