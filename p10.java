/* Write a Java program that swaps two elements ( first and third elements ) in a linked list  ( using Collections.swap(l_list, 0, 2)) */
package hc1;

import java.util.*;
public class p10 {

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

        // Print the list before swapping
        System.out.println("Before swapping");
        System.out.println(ls);

        // Swap elements at index 2 and 3
        // Index 2 → "pink", Index 3 → "red"
        Collections.swap(ls, 2, 3);

        // Print the list after swapping
        System.out.println("After swapping");
        System.out.println(ls);
    }
}
