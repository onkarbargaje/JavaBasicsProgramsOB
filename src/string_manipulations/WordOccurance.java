package string_manipulations;

import java.util.HashMap;
import java.util.Map;

public class WordOccurance {

	public static void main(String[] args)
	{

            String input= "For each word, the program checks if it is already in the HashMap. If it"
            		+ " is, it increments the count. If not, it adds the word with a count of";
            Map<String,Integer>wordCount= new HashMap<String,Integer>();
            
           String [] words=input.split("\\s+");
           // String pattern = "[^a-zA-Z0-9\\s]";
            //String cleanedString = input.replaceAll(pattern, "");
            System.out.println(words);
			for (String e : words) {
				e = e.toLowerCase();

				if (wordCount.containsKey(e)) {
					wordCount.put(e, wordCount.get(e) + 1);

				} else {
					wordCount.put(e, 1);
				}

			}
			System.out.print(wordCount);

	}

}
