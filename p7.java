/* Write a Java program to iterate a linked list in reverse order (using objlist.descendingIterator())*/
package hc1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class p7 {

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

        // Option 1 (commented out): Iterate backwards using ListIterator
        // ListIterator<String> listIterator = ls.listIterator(ls.size());
        // while (listIterator.hasPrevious()) {
        //     System.out.println(listIterator.previous());
        // }

        // Option 2 (active): Use descendingIterator() to traverse in reverse order
        Iterator iterator = ls.descendingIterator();

        // Loop through the list in reverse order
        while (iterator.hasNext()) {
            // Print each element starting from the last ("Blue") backwards
            System.out.println(iterator.next());
        }
    }
}
