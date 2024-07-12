package sDET;

public class IncrementDecrement {

	public static void main(String[] args) 
	{
		int i=1, j=2,k=3;
		
		int m= i-- - j-- - k--;
		
		System.out.println(i);
		System.out.println("i="+i);
		System.out.println("j="+j);
		System.out.println("k="+k);
		System.out.println("m="+m);
		int n= i-- - j-- - k--;
		System.out.println("i="+i);
		System.out.println("j="+j);
		System.out.println("k="+k);
		System.out.println("n="+n);
	}

}
