package sDET;

public class StringManipulation {

	public static void main(String[] args) 
	{
		String s= "Onkar Shashikant Bargaje Solapur";
		String s1= "K2irti";
		System.out.println(s.length());
		
		System.out.println(s.indexOf("S"));
		System.out.println(s.indexOf("S", 7)); // first occurrence of S
		System.out.println(s.indexOf("S", s.indexOf("S")+1));
		 // second occurrence of s
		System.out.println(s.indexOf("Kirti"));
		// if any string not available then it will return -1
		System.out.println(String.join(" ", s,s1));
		
		System.out.println(s1.replace('i', 'o'));
		System.out.println(s1.replaceFirst("i", "o"));
		System.out.println(s);
		System.out.println(s.replaceAll("a(..)", "O")); //after a 2 character will removed
		System.out.println(s.replaceAll("a(.)", "O")); //after a 1 character will removed
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.concat(s));
		System.out.println(s1.concat("Bargaje"));
	}

}
