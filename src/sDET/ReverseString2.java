package sDET;

public class ReverseString2 {

	public static void main(String[] args) 
	{
		String s3= "Capgemini";
		String s1=s3.toUpperCase();
		String s2="";
		
		for (int i= s1.length()-1; i>=0; i--)
			
		
			//char s3=s1.charAt(i);
			s2=s2+s1.charAt(i);
			System.out.println("Output String is : "+ s2);
		
}

}
