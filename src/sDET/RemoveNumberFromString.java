package sDET;

public class RemoveNumberFromString {

	public static void main(String[] args) 
	{
		String ab= "Onkar902890Bargaje4946";
		char[] c=ab.toCharArray();
		StringBuilder sb= new StringBuilder();
		
		for(int i=0; i<c.length; i++)
		{
			if(Character.isDigit(c[i]))
			{
				i++;
			}
			else
			{
				sb.append(c[i]);
			}
		}
		System.out.println(sb);

	}

}
