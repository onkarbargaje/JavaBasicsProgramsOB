package sDET;

public class Practice_1 {

	public static void main(String[] args) {
		int input = 1211;
		int original=input;
		int output = 0;
		{
			while (input != 0) {
				output = output * 10 + input % 10;
				input = input / 10;

			}
			if (original == output) {
				System.out.println("given number is palindrome number " + original);

			} else {
				System.out.println("given number is not palindrome number "+ original);
			}

		}
	}

}