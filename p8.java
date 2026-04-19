/* Write a Java program to insert the specified element at the end of a linked list.( using l_listobj.offerLast("Pink"))*/
package hc1;
import java.util.*;
public class p8 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Create a LinkedList of Strings
        LinkedList<String> ls = new LinkedList<>();

        // Add elements (color names) to the list
        ls.add("Orange");
        ls.add("geen");   // Typo: "geen" probably meant "green"
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        // Print the list before adding new element
        System.out.println(ls);

        // Add an element at the end of the LinkedList
        // addLast() always inserts at the tail (last position)
        ls.addLast("pink");

        // Print the list after adding "pink" at the end
        System.out.println(ls);
    }
}
