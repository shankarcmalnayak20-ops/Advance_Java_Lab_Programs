/* 
Write a java program for getting different colors through ArrayList interface and  sort them using Collections.sort( ArrayListObj)
*/
 package hc1;

import java.util.*;
public class p3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Create a List of Strings using ArrayList
        List<String> ls = new ArrayList<>();

        // Add elements (colors) to the list
        ls.add("Orange");
        ls.add("geen");   // Note: "geen" looks like a typo for "green"
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        // Print the list before sorting
        System.out.println("Before sorting:");
        System.out.println(ls);

        // Sort the list in natural (alphabetical) order
        Collections.sort(ls);

        // Print the list after sorting
        System.out.println("After sorting:");
        System.out.println(ls);
    }
}
