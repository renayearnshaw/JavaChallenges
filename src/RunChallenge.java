import challenges.*;
import utils.TimeCode;

public class RunChallenge {
    public static void main(String[] args) {
//        runFizzBuzz();
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

        int[] indices = TwoSum.printIndices(numArray, sum);
        if (indices != null) {
            System.out.printf("Indices for a sum of %d are %d and %d (values of %d and %d respectively)\n",
                    sum, indices[0], indices[1], numArray[indices[0]], numArray[indices[1]]);
        } else {
            System.out.println("No solution found");
        }
    }

}
