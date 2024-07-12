package sDET;

public class LargestNumberInArray {

	public static void main(String[] args) {
		int [] input= {12,34,8,57,90,15,3210};
		 int maxNumber= input[0];
		 
		 for (int i=0; i<input.length; i++)
		 {
			 if(input[i]>maxNumber)
			 {
				 maxNumber=input[i];
			 }
		 }
		 System.out.println("Maximum number in given array is "+maxNumber);
		

	}

}
