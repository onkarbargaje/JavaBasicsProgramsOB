package sDET;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MaxWordCountFromString 
{
	

	public static void main(String[] args)  {
		String path= "F:\\test.txt"; 
		Map<String, Integer> countMap= new HashMap<String, Integer>();
		FileReader fr=null;
		try {
			fr = new FileReader(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader br= new BufferedReader(fr);
		String fileContent;
		try {
			while((fileContent=br.readLine()) !=null)
			{
				//System.out.println(fileContent);
				String cleanedString=fileContent.toLowerCase().replaceAll("[^a-z0-9]", " ");
				String[] splitString=cleanedString.split("\\s+");
				for(String e:splitString)
				{
					countMap.put(e, 0);
				}
				//System.out.println(countMap);
				
				for(String f:splitString)
				{
					if(countMap.containsKey(f))
					{
						countMap.put(f, countMap.get(f)+1);
					}
				}
				countMap.forEach((k,v) ->System.out.println(k + ":" +v));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
