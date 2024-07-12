package sDET;

public class CountOfAll 
{

	public static void main(String[] args) 
	{
        String s1="Onkar Kirti 12052023*&*";
        char[] c1=s1.toCharArray();
        int totalLength=c1.length;
        int alphaCount=0;
        int spaceCount=0;
        int numberCount=0;
        int specialCharacterCount=0;
        
        for(int i=0; i<c1.length; i++)
        {
        	boolean flag1=Character.isAlphabetic(c1[i]);
        	boolean flag2=Character.isDigit(c1[i]);
        	boolean flag3=Character.isSpaceChar(c1[i]);
        
        if(flag1==true)
        {
        	alphaCount++;
        }
        if(flag2==true)
        {
        	numberCount++;
        }
        if(flag3==true)
        {
        	spaceCount++;
        }
        
        
        }
        specialCharacterCount=totalLength-(alphaCount+numberCount+spaceCount);
        System.out.println("count of alphabate is/are "+alphaCount);
        System.out.println("count of number is/are "+numberCount);
        System.out.println("count of space is/are "+spaceCount);
        System.out.println("count of specialChar is/are "+specialCharacterCount);


	}

}
