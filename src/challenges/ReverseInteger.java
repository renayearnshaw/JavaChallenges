package challenges;

/**
 * The Reverse an Integer challenge:
 *   <p>Write a short program that reverses an integer.</p>
 *
 * @author Renay Earnshaw
 */
public class ReverseInteger {
    public static int reverse(int input) {
        int reversed;
        // If the input is a negative number, make it positive and record the fact that it's negative
        boolean negative = input < 0;

        if (negative) {
            input = Math.abs(input);
        }

        reversed = reverseInput(input);

        // Re-apply the negativity of the input
        if (negative) {
            reversed *= -1;
        }

        return reversed;
    }

    private static int reverseInput(int input) {
        long reversed = 0;

        while (input > 0) {
            reversed = (reversed * 10) + (input % 10);
            input /= 10;
        }

        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            reversed = 0;
        }

        return (int) reversed;
    }
}
