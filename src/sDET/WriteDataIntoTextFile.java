package sDET;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException
	{
		FileWriter fw= new FileWriter("F:\\test.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		
		bw.write("Payer Hub application, a multi-payer product platform that supports payer needs such\r\n"
				+ "as Medical Record Release, Prior/Blue MRR, Bulk request, Practice setup "
				+ "wizards and more. With authorization from the provider, FigMD pulls clinical "
				+ "data from multiple EHRs and delivers the consolidated medical record to "
				+ "payers in a standardized format.");
		
		bw.close();
		

	}

}
