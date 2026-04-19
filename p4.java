/* 
  Write a java program for getting different colors through ArrayList interface and extract the elements 1st and 2nd from the ArrayList object  by  using SubList() 
*/
package hc1;

import java.util.*;
public class p4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Create a List of Strings using ArrayList
        List<String> ls = new ArrayList<>();

        // Add elements (colors) to the list
        ls.add("Orange");
        ls.add("geen");   
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        // Print the original list
        System.out.println(ls);

        // Demonstrate usage of subList()
        System.out.println("using sublist:");

        // subList(fromIndex, toIndex) returns a portion of the list
        // Here it returns elements from index 0 (inclusive) to 2 (exclusive)
        System.out.println(ls.subList(0, 2));
    }
}
