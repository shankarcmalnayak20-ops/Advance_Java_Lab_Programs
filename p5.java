/* 
Write a java program for getting different colors through ArrayList interface and delete nth  element from the ArrayList object  by  using remove by index
*/

package hc1;

import java.util.*;
public class p5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Create a List of Strings using ArrayList
        List<String> ls = new ArrayList<>();

        // Add elements (colors) to the list
        ls.add("Orange");
        ls.add("green");
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

         int n=3;  // Example of index-based removal (currently commented out)

        // Define the string to remove
        String Str = "green";

        // Print the original list
        System.out.println(ls);

        // Remove the element "green" by value
        // remove(Object o) returns true if the element is found and removed, else false
        System.out.println("Removing the nth Element:" + ls.remove(Str));

        // Print the list after removal
        System.out.println(ls);
    }
}
