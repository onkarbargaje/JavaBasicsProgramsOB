package sDET;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("F:\\test.txt");
		BufferedReader br= new BufferedReader(fr);
		String fileContent;
		while((fileContent=br.readLine())!=null)
		{
			System.out.println(fileContent);
		}
		
		br.close();
	}

}
