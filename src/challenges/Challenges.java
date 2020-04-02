package challenges;

import utils.TimeCode;

public class Challenges {
    public static void main(String[] args) {

        // Run the standard FizzBuzz and time how long the loop takes to run
        try (TimeCode t = new TimeCode()) {
            FizzBuzz.standardVersion(100);
        }

        //  Run the functional FizzBuzz and time how long the loop takes to run
        try (TimeCode t = new TimeCode()) {
            FizzBuzz.functionalVersion(100);
        }

    }
}
