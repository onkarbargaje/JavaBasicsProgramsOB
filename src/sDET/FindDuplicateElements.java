package sDET;

public class FindDuplicateElements {

	public static void main(String[] args) 
	{
         Object[] words= {1,1,2,3,4,5,4,5,6,7,8,9,0};
        	 //{"Onkar", "Onkar", "Kamel", "KAMEL"};
         
         
         
         for(int i=0;i<words.length; i++)
         {
        	 for (int j=i+1; j<words.length; j++)
        	 {
        		 if(words[i].equals(words[j]))
        		 {
        			 System.out.println("Duplicate element found "+ words[i]);
        		 }
        		 
        	 }
         }
         

	}

}
