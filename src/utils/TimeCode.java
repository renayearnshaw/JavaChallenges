package utils;

import java.time.Duration;
import java.time.Instant;

/**
 * Uses try-with-resources functionality to wrap a timer around a method call
 *
 * @author Renay Earnshaw
 */
public class TimeCode implements AutoCloseable {
    private Instant start;
    private Instant end;
    private long timeElapsed;

    public TimeCode() {
        start = Instant.now();
    }

    @Override
    public void close() {
        end = Instant.now();
        timeElapsed = Duration.between(start, end).toMillis();
        System.out.printf("Time elapsed is: %d ms\n", timeElapsed);
    }
}
