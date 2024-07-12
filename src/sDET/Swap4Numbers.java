package sDET;

public class Swap4Numbers {

	public static void main(String[] args) {
		int a = 10;
	    int b= 20;
	    int c= 30;
	    int d= 40;
	    System.out.println("numbers before swaping are "+ a +","+ b +","+ c +"," +d);
	    
	  a= a+b+c+d;
	  b= a-(b+c+d);
	  c= a-(b+c+d);
	  d= a-(b+c+d);
	  a= a-(b+c+d);

	  System.out.println("numbers after swaping are "+ a +","+ b +","+ c +"," +d);


	}

}
