import challenges.*;
import utils.TimeCode;

import java.util.Optional;
/**
 * The Java challenge harness used to run the various java challenges.</p>
 *
 * @author Renay Earnshaw
 */
public class RunChallenge {
    public static void main(String[] args) {
        runIntegerToRomanNumeral();
    }

    /**
     * The FizzBuzz challenge.
     *
     * <p/><p>This contains two versions of the challenge - one standard, and one using functional methods.</p>
     */
    private static void runFizzBuzz() {
        // Run the standard FizzBuzz and time how long the loop takes to run
        try (TimeCode t = new TimeCode()) {
            FizzBuzz.standardVersion(100);
        }

        //  Run the functional FizzBuzz and time how long the loop takes to run
        try (TimeCode t = new TimeCode()) {
            FizzBuzz.functionalVersion(100);
        }
    }

    /**
     * The Two Sum challenge.
     */
    private static void runTwoSum() {
        int sum = 9;
        int[] numArray = {2, 7, 11, 15};

        Optional<int[]> opt = TwoSum.printIndices(numArray, sum);
        opt.ifPresentOrElse(
            indices -> System.out.printf(
                "Indices for a sum of %d are %d and %d (values of %d and %d respectively)\n",
                sum, indices[0], indices[1], numArray[indices[0]], numArray[indices[1]]),
            () -> System.out.println("No solution found"));
    }

    /**
     * The Reverse a String challenge.
     *
     * <p/><p>This contains three versions of the challenge - one using the StringBuilder API,
     * one using a mix of low-level string manipulation and StringBuilder, and one using
     * just low-level string manipulation.</p>
     */
    private static void runReverseStrings() {

        String reversed = ReverseString.reverseManually("Renay Earnshaw");
        System.out.println(reversed);

        reversed = ReverseString.reverseManuallyWithStringBuilder(reversed);
        System.out.println(reversed);

        System.out.println(ReverseString.reverseWithStringBuilder(reversed));
    }

/**
 * The Implement a Stack challenge.
 */
    private static void runStack() {
        Stack stack = new Stack(3);

        try {
            System.out.println(stack.peep());
            System.out.print("Pushing 1. "); stack.push(1); stack.print();
            System.out.print("Pushing 2. "); stack.push(2); stack.print();
            System.out.print("Pushing 3. "); stack.push(3); stack.print();
            System.out.print("Pushing 4. "); stack.push(4);
        } catch (StackOverflowError e) {
            System.out.println(e.getMessage());
        }

        System.out.printf("Peeping gets: %d. Popping gets: %d. ", stack.peep(), stack.pop()); stack.print();
        System.out.printf("Peeping gets: %d. Popping gets: %d. ", stack.peep(), stack.pop()); stack.print();
        System.out.printf("Peeping gets: %d. Popping gets: %d. ", stack.peep(), stack.pop()); stack.print();
        System.out.printf("Peeping gets: %d. Popping gets: %d. ", stack.peep(), stack.pop()); stack.print();
    }

    /**
     * The Reverse an Integer challenge.
     */
    private static void runReverseIntegers() {

        int input = 987654321;
        System.out.printf("The reverse of %d is %d\n", input, ReverseInteger.reverse(input));

        input = -987654321;
        System.out.printf("The reverse of %d is %d\n", input, ReverseInteger.reverse(input));

        input = 876543210;
        System.out.printf("The reverse of %d is %d\n", input, ReverseInteger.reverse(input));

        // Test the maximum limit
        input = Integer.MAX_VALUE;
        System.out.printf("The reverse of %d is %d\n", input, ReverseInteger.reverse(input));

        // Test the minimum limit
        input = Integer.MIN_VALUE;
        System.out.printf("The reverse of %d is %d\n", input, ReverseInteger.reverse(input));

        // Test that zero is handled correctly
        input = 0;
        System.out.printf("The reverse of %d is %d\n", input, ReverseInteger.reverse(input));
    }

    private static void runIntegerToRomanNumeral() {
        int[] inputs = {
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
                10, 15, 22, 34, 57, 78, 99,
                100, 223, 569, 842, 999,
                1000, 1569, 2050, 2888, 3000, 3001};
        Optional<String> opt;

        for (int input: inputs) {
            opt = IntegerToRomanNumeral.map(input);

            opt.ifPresentOrElse(
                    romanNumeral -> System.out.printf("%d in roman numerals is %s\n", input, romanNumeral),
                    () -> System.out.println("No solution found"));
        }

    }

}
