import challenges.FizzBuzz;
import challenges.ReverseString;
import challenges.TwoSum;
import utils.TimeCode;

import java.util.Optional;
/**
 * The Java challenge harness used to run the various java challenges.</p>
 *
 * @author Renay Earnshaw
 */
public class RunChallenge {
    public static void main(String[] args) {
        runReverseStrings();
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

}
