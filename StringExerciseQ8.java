/* Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined function isNumeric()
*/
package hc1;

public class StringExerciseQ8 {
    // User-defined function
    public static boolean isNumeric(String str) {
        return str != null && str.matches("\\d+"); // regex for digits only
    }

    public static void main(String[] args) {
        String test1 = "12345";
        String test2 = "AIET123";
        System.out.println(test1 + " is numeric? " + isNumeric(test1));
        System.out.println(test2 + " is numeric? " + isNumeric(test2));
    }
}
