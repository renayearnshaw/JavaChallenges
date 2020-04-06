import challenges.FizzBuzz;
import challenges.TwoSum;
import utils.TimeCode;

import java.util.Optional;

public class RunChallenge {
    public static void main(String[] args) {
        runTwoSum();
    }

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

    private static void runTwoSum() {
        long sum = 9;
        int[] numArray = {2, 7, 11, 15};

        Optional<int[]> opt = TwoSum.printIndices(numArray, sum);
        opt.ifPresentOrElse(
            indices -> System.out.printf(
                "Indices for a sum of %d are %d and %d (values of %d and %d respectively)\n",
                sum, indices[0], indices[1], numArray[indices[0]], numArray[indices[1]]),
            () -> System.out.println("No solution found"));
    }

}
