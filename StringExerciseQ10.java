/* Q10. Write a Java Program for Counting the number of words in a string using user defined function countWords()
*/
 package hc1;
 public class StringExerciseQ10 {
	    // User-defined function
	    public static int countWords(String str) {
	        if (str == null || str.trim().isEmpty()) return 0;
	        String[] words = str.trim().split("\\s+"); // split by whitespace
	        return words.length;
	    }

	    public static void main(String[] args) {
	        String input = "AIET College of Engineering and Technology";
	        System.out.println("Input: " + input);
	        System.out.println("Word count: " + countWords(input));
	    }
	}


