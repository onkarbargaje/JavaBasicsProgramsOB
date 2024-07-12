package sDET;

public class CountOfSpecificCharacter {

	public static void main(String[] args) {
		String s1 = "Java is java again java again jeevan";
		String s=s1.toLowerCase();
		char c = 'i';
		int count = s.length() - s.replace("i", "").length();
		System.out.println("Number of occurances of "+ c +" is: " + count);

	}

}
