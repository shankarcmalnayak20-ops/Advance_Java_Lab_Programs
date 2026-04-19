/* Q2. Write a Java Program for Counting how many times a substring appears in a main string using user defined function countOccurrences()*/
package hc1;

public class StringExerciseQ {
    // User-defined function
    public static int countOccurrences(String main, String sub) {
        int count = 0;
        int index = 0;
        while ((index = main.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length(); // move past the last found substring
        }
        return count;
    } 

    public static void main(String[] args) {
        String main = "AIET AIET AIET College AIET";
        String sub = "AIET";
        System.out.println("Occurrences of '" + sub + "': " + countOccurrences(main, sub));
    }
}

