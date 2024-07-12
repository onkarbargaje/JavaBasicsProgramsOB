package sDET;

public class Practice_Rev_String 
{
	String ip= "Kirti";
    String op="";
   

	public static void main(String[] args) 
	{

         String ip= "Kirti";
         String op="";
         //ip.substring(2);
         System.out.println(ip.substring(2));
         System.out.println("Original string is " + ip );
         
         for (int i=ip.length()-1; i>=0; i--)
         
        	 //char c=ip.charAt(i);
        	 op=op+ip.charAt(i);
        	 System.out.println("Reversed string is " + op );
         

	}

}
