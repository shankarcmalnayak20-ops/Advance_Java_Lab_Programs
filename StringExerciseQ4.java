/* Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case and punctuation) using user defined function isPalindrome():*/
package hc1;
public class StringExerciseQ4 {
    // User-defined function
    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        // Remove non-alphanumeric characters and convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        String test1 = "Madam";
        String test2 = "A man, a plan, a canal: Panama";
        String test3 = "Hello";

        System.out.println("'" + test1 + "' is palindrome? " + isPalindrome(test1));
        System.out.println("'" + test2 + "' is palindrome? " + isPalindrome(test2));
        System.out.println("'" + test3 + "' is palindrome? " + isPalindrome(test3));
    }
}

 
