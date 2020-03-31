package challenges;

import java.util.stream.IntStream;

/**
 * The FizzBuzz challenge:
 *   <p>Write a short program that prints each number from 0 to <i>n</i> on a new line.</p>
 *   <p>- For each multiple of 3, print "Fizz" instead of the number.</p>
 *   <p>- For each multiple of 5, print "Buzz" instead of the number.</p>
 *   <p>- For each number that is a multiple of both 3 and 5, print "FizzBuzz" instead of the number.</p>
 *   <p/>Use as few characters as possible
 *
 * @author Renay Earnshaw
 */
public class FizzBuzz {
    /**
     * The standard version of the method
     *
     * @param n the number of times to loop
     */
    public static void standardVersion(final int n) {
        for (int i = 1; i <= n; i++) {
            boolean div3 = i % 3 == 0;
            boolean div5 = i % 5 == 0;
            if (div3 && div5) {
                System.out.println("FizzBuzz");
            } else if (div3) {
                System.out.println("Fizz");
            } else if (div5) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    /**
     * The functional version of the method
     *
     * @param n the number of times to loop
     */
    public static void functionalVersion(final int n) {
        IntStream.rangeClosed(1, n)
                .forEach(i -> {
                    boolean div3 = i % 3 == 0;
                    boolean div5 = i % 5 == 0;
                    if (div3 && div5) {
                        System.out.println("FizzBuzz");
                    } else if (div3) {
                        System.out.println("Fizz");
                    } else if (div5) {
                        System.out.println("Buzz");
                    } else {
                        System.out.println(i);
                    }
                });
    }
}
