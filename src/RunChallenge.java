import challenges.FizzBuzz;
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
        runFizzBuzz();
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

}
