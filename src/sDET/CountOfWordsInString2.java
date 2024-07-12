package sDET;

public class CountOfWordsInString2 {

	public static void main(String[] args) {
		String input= ("Payer Hub application, a multi-payer product platform that supports payer needs such\r\n"
				+ "as Medical Record Release, Prior/Blue MRR, Bulk request, Practice setup "
				+ "wizards and more. With authorization from the provider, FigMD pulls clinical "
				+ "data from multiple EHRs and delivers the consolidated medical record to "
				+ "payers in a standardized format.");
		
		String [] split=input.split("\\s+");
		System.out.println(split.length);

	}

}
