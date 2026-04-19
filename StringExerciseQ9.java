/* Q9. Write a Java Program for Creating a random string of a specified length using user defined function generateRandomString()*/
package hc1;

import java.util.Random;

public class StringExerciseQ9 {
    // User-defined function
    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Random String (length 8): " + generateRandomString(8));
        System.out.println("Random String (length 12): " + generateRandomString(12));
    }
}
