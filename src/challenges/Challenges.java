package challenges;

import java.time.Duration;
import java.time.Instant;

public class Challenges {
    public static void main(String[] args) {

        // Run the standard FizzBuzz and time how long the loop takes to run
        Instant start = Instant.now();
        FizzBuzz.standardVersion(100);
        Instant end = Instant.now();
        long timeElapsed = Duration.between(start, end).toMillis();
        System.out.printf("Time elapsed for the standard method is: %d ms\n", timeElapsed);

        //  Run the functional FizzBuzz and time how long the loop takes to run
        start = Instant.now();
        FizzBuzz.functionalVersion(100);
        end = Instant.now();
        timeElapsed = Duration.between(start, end).toMillis();
        System.out.printf("Time elapsed for functional method is: %d ms\n", timeElapsed);
    }
}
