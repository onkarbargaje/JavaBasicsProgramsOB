package sDET;

public class SeparateWordsFromString {

	public static void main(String[] args) {
		String input= "STAYHOMESTAYSAFE";
		
		StringBuffer sb= new StringBuffer();
		
		sb.append(input, 0,5).append(" ");
//		sb.append(input, 4,8).append(" ");
//		sb.append(input, 8,12).append(" ");
//		sb.append(input.substring(12));
		
		String result=sb.toString();
		System.out.println(result);
		

	}

}
