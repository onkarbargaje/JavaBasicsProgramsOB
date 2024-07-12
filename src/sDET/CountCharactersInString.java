package sDET;

public class CountCharactersInString 
{
	public static String ab ="Onkar Bargaje";

	public static void main(String[] args) 
	{
		String [] split=ab.split("\\s");
		System.out.println(split.length);
		char[] c= ab.toCharArray();
		int count=0;
		System.out.println(c);
		
		for(int i=0; i<ab.length(); i++)
		{
			if(c[i]!=' ')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
