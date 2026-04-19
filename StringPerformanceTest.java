/* 2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify your answer which one is better.*/
package hc1;

public class StringPerformanceTest {
    public static void main(String[] args) {
        // Number of iterations
        int iterations = 10000;

        // Test with StringBuffer (thread-safe, synchronized)
        StringBuffer sbuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime(); // Start time
        for (int i = 0; i < iterations; i++) {
            sbuffer.append("AIET");
        }
        long endTimeBuffer = System.nanoTime(); // End time
        long durationBuffer = endTimeBuffer - startTimeBuffer;
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " nanoseconds");

        // Test with StringBuilder (non-synchronized, faster)
        StringBuilder sbuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime(); // Start time
        for (int i = 0; i < iterations; i++) {
            sbuilder.append("AIET");
        }
        long endTimeBuilder = System.nanoTime(); // End time
        long durationBuilder = endTimeBuilder - startTimeBuilder;
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " nanoseconds");

        // Justification
        if (durationBuffer > durationBuilder) {
            System.out.println("StringBuilder is faster because it is non-synchronized.");
        } else {
            System.out.println("StringBuffer is faster in this run, but usually StringBuilder performs better.");
        }
    }
}
