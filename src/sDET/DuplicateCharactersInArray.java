package sDET;

public class DuplicateCharactersInArray {

	public static void main(String[] args) 
	{
		String input= "Shashikant";
		
		//char [] ch=input.toCharArray();
		
		for(int i=0; i<input.length(); i++)
		{
			for (int j=i+1; j<input.length(); j++)
			{
				if(input.charAt(i)==input.charAt(j))
				{
					System.out.print(input.charAt(j));
				}
			}
		}

	}

}
