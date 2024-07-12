package sDET;

public class SeparateAlphaNumSpeChar {

	public static void main(String[] args)
	{
        String input= "abcdsj@34@*)$)#klap109kl";
        StringBuffer alphabate = new StringBuffer();
        StringBuffer number = new StringBuffer();
        StringBuffer specialChar= new StringBuffer();
        
        for(int i=0; i<input.length(); i++)
        {
        	if(Character.isLetter(input.charAt(i)))
        	{
        		alphabate.append(input.charAt(i));
        	}
        	else if (Character.isDigit(input.charAt(i)))
        	{
        		number.append(input.charAt(i));
        	}
        	else
        	{
        		specialChar.append(input.charAt(i));
        }

	}
        
        System.out.println("alphabates in given input is/are "+ alphabate);
        System.out.println("numbers in given input is/are "+ number);
        System.out.println("special characters in given input is/are "+ specialChar);

}
}
