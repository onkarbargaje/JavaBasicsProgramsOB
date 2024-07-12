package sDET;

public class ReverseString3 {

	public static void main(String[] args) 
	{

        String str= "Onkar Shashikant Bargaje";
        String rev="";
        String [] words=str.split(" "); //splitting string in word
        
        for (String eachWord:words) 
        {
        	//System.out.println(eachWord);
        	String revEachWord= "";
        	
        	for(int i=eachWord.length()-1; i>=0;i--)
        	{
        		revEachWord=revEachWord+eachWord.charAt(i);
        		//System.out.println(revEachWord);
        	}
        	rev=rev+revEachWord+" ";
        	//System.out.println(revEachWord);
        	//System.out.println(rev);
        	
        }
    	System.out.println(rev);

        
       

	}

}
