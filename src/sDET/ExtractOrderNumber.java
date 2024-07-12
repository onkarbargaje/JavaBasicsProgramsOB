package sDET;

public class ExtractOrderNumber {

	public static void main(String[] args)
	{

           String s= "Your order number is ABC98929 confirmed ";
           
           String s2=s.substring(s.indexOf("is")+3, s.indexOf("c")-1);
           System.out.println(s2);

	}

}
