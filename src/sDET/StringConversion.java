package sDET;

public class StringConversion {
    public static void main(String[] args) {
        String input = "abc ert ghj";
        String output = convertString(input);
        System.out.println(output); // Output: CBA ert JHG
    }

    public static String convertString(String input) {
        // Split the input string into words
        String[] words = input.split(" ");

        // StringBuilder to hold the result
        StringBuilder result = new StringBuilder();

        // Iterate through each word
        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) { // Check if the word contains only alphabetic characters
                // Reverse the word and convert to uppercase
                String reversed = new StringBuilder(word).reverse().toString().toUpperCase();
                result.append(reversed);
            } else {
                // If the word contains non-alphabetic characters, leave it as it is
                result.append(word);
            }
            result.append(" "); // Add a space after each word
        }

        // Remove the trailing space
        return result.toString().trim();
    }
}
