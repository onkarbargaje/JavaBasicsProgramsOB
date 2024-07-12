package string_manipulations;

public class CompareStrings {

	public static void main(String[] args) 
	{
	   String s1= "onkar221";
	   String s2= "kirti221";
	   
	  boolean bothString= compareTwoString(s1, s2);
	   
	   System.out.println("does the two strings are equal? "+ bothString);
	   
	   
	}
	
	public static boolean compareTwoString(String s1, String s2)
	{
		if(s1.length()!=s2.length())
		   {
			   return false;
		   }
		   
		   for(int i=0; i<s1.length();i++)
		   {
			   if(s1.charAt(i)!=s2.charAt(i))
			   {
				   return false;
			   }
		   }
		   return true;
	}
	
}

