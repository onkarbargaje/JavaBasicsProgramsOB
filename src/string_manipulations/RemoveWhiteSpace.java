package string_manipulations;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String input="   Onk a Kir ti Bar  gaje   ";
		//String output=input.replaceAll(" ", "");
		String output=input.replaceAll("\\s", "");
		System.out.println(output);

	}

}
