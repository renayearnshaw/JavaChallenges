package utils;

import java.time.Duration;
import java.time.Instant;

/**
 * Uses try-with-resources functionality to wrap a timer around a method call
 *
 * @author Renay Earnshaw
 */
public class TimeCode implements AutoCloseable {
    private final Instant start;

    public TimeCode() {
        start = Instant.now();
    }

    @Override
    public void close() {
        Instant end = Instant.now();
        long timeElapsed = Duration.between(start, end).toMillis();
        System.out.printf("Time elapsed is: %d ms\n", timeElapsed);
    }
}
