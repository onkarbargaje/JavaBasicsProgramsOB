package sDET;

public class FindDuplicateByHashMap {

	public static void main(String[] args)
	{
		String Infra[]= {"Amazon", "Flipkart", "AWS", "GCP","Flipkart", "AWS", "GCP"};
		
		for(int i=0; i<= Infra.length-1;i++)
		{
			for (int j=i+1; j<= Infra.length-1;j++)
			{
				if (Infra[i].equals(Infra[j]))
				{
					System.out.println("Duplicate element found "+ Infra[i]);
				}
			}
		}

	}

}
