/* 1b. Array List programs start*/
/* 
Write a java program for getting different colors through ArrayList interface and search whether the color "Red" is available or not 
( Hint : Use ArrayListObj.contains() ) 
*/

 package hc1;

import java.util.*;
public class p1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Create a List of Strings using ArrayList
        List<String> ls = new ArrayList<>();

        // Add elements (color names) to the list
        ls.add("Orange");
        ls.add("geen");   // Typo: "geen" probably meant "green"
        ls.add("pink");
        ls.add("red");

        // Print the entire list
        System.out.println(ls);

        // Check if the list contains the element "red"
        if(ls.contains("red")) {
            // If "red" is found in the list
            System.out.println("available");
        } else {
            // If "red" is NOT found in the list
            System.out.println("available not");
        }
    }
}

