package sDET;

public class PrimeNumber {

	public static void main(String[] args) 
	{

       int a= 24;
       
       int count=0;
       
       for(int i=1; i<=a; i++)
       {
    	   if(a%i==0)
    	   {
    		   count++;
    	   }
    	   
       }
       if(count==2)
	   {
		   System.out.println("Given number is prime: "+ a);
	   }
	   else
	   {
		   System.out.println("Given number is not prime: "+ a);
	   }

	}

}
