/* Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined function removeWhitespace() */
 package hc1;
 
 public class StringExerciseQ5 {
	    // User-defined function
	    public static String removeWhitespace(String str) {
	        return str.replaceAll("\\s+", "");
	    }

	    public static void main(String[] args) {
	        String input = " AIET   College   ";
	        System.out.println("Original: '" + input + "'");
	        System.out.println("Without whitespace: '" + removeWhitespace(input) + "'");
	    }
	}
