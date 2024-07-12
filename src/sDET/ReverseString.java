package sDET;

public class ReverseString {

	public static void main(String[] args) {
		String st = "ONKAR";
		String rev = "";
		// 01 using character array
		
		  char c []=st.toCharArray();
		  System.out.println(c); 
		  System.out.println(rev);
		 String s=st.toLowerCase(); 
		 System.out.println(s); String
		 p=s.concat(" Bargaje"); 
		 System.out.println(p); 
		 int l=st.length(); 
		 for (int i=l-1; i>=0; i--) ///as array will start from 0 hence 0,1,2,3,4 {
		 
			 rev=rev+c[i];
		 } 
	    System.out.println(rev);
		 

		// using stringBuffer

		/*
		 * StringBuffer sb = new StringBuffer(st); StringBuffer sy = sb.reverse();
		 * System.out.println(sy);
		 */
	}

}
