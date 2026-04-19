/* 1c. Linked List Programs start*/
/* Write a Java program to iterate through all elements in a linked list starting at the specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))*/
package hc1;

import java.util.*;
public class p6 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Create a LinkedList of Strings
        List<String> ls = new LinkedList<>();

        // Add elements (color names) to the list
        ls.add("Orange");
        ls.add("geen");   // Typo: "geen" probably meant "green"
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        // Create an Iterator starting from index 2 (third element)
        // listIterator(2) means iteration begins at position 2 → "pink"
        Iterator iterator = ls.listIterator(2);

        // Loop through the list from index 2 onwards
        while (iterator.hasNext()) {
            // Print each element starting from "pink"
            System.out.println(iterator.next());
        }
    }
}

