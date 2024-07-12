package sDET;

public class PalindromeString2 {

	public static void main(String[] args) 
	{
       String ab="Nitin";
		
		String rev="";
		//char []c=ab.toCharArray();
		
		//System.out.println(c.length);
		//System.out.println(c);
		for(int i=ab.length()-1; i>=0; i--)
		
			rev=rev+ab.charAt(i);
			//System.out.println(rev);
		
		    System.out.println(rev);
		    
		    if(ab.equalsIgnoreCase(rev))
		    {
		    	System.out.println(ab + " String is palindrome");
		    }
		    else
		    {
		    	System.out.println(ab + " String is not palindrome");
		    }
		


		

	}

}
