/* 3a. Develop a java program for performing various string operations with different string handling functions directed as follows:
String Creation and Basic Operations, Length and Character Access, String Comparison, String Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and startsWith() and endsWith()
*/
package hc1;
import java.util.*;

public class StringOperationsDemo3a {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 of str1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "Hello";
        System.out.println("str1 equals str3? " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase 'hello'? " + str1.equalsIgnoreCase("hello"));
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

        // 4. String Searching
        String sentence = "Java programming is fun";
        System.out.println("Index of 'programming': " + sentence.indexOf("programming"));
        System.out.println("Contains 'Java'? " + sentence.contains("Java"));

        // 5. Substring Operations
        System.out.println("Substring from index 5: " + sentence.substring(5));
        System.out.println("Substring from 5 to 16: " + sentence.substring(5, 16));

        // 6. String Modification
        System.out.println("Replace 'fun' with 'powerful': " + sentence.replace("fun", "powerful"));

        // 7. Whitespace Handling
        String spaced = "   Trim me   ";
        System.out.println("Before trim: '" + spaced + "'");
        System.out.println("After trim: '" + spaced.trim() + "'");

        // 8. String Concatenation
        String concat = str1 + " " + str2;
        System.out.println("Concatenated String: " + concat);

        // 9. String Splitting
        String csv = "Apple,Banana,Orange";
        String[] fruits = csv.split(",");
        System.out.println("Splitting CSV:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo (mutable string)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");          // append
        sb.insert(6, "Java ");        // insert
        sb.delete(6, 11);             // delete
        System.out.println("StringBuilder result: " + sb);

        // 11. String Formatting
        String name = "Alice";
        int age = 25;
        System.out.println(String.format("Name: %s, Age: %d", name, age));

        // 12. Validate Email with contains(), startsWith(), endsWith()
        String email = "student@example.com";
        if (email.contains("@") && email.startsWith("student") && email.endsWith(".com")) {
            System.out.println("Valid email format");
        } else {
            System.out.println("Invalid email format");
        }
    }
}


 
