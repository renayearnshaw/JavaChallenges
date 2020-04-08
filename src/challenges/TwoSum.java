package challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * The TwoSum challenge:
 *   <p/><p>Given an array of integers, return indices of the two numbers that add up to a specific target.</p>
 *   <p>You may assume that each input would have exactly one solution, and you may not use the same element twice.</p>
 *   <p/><p>Example:</p>
 *   <p>Given nums = [2, 7, 11, 15], target = 9,</p>
 *   <p/>Because nums[0] + nums[1] = 9, return [0, 1]
 *
 * @author Renay Earnshaw
 */
public class TwoSum {
    public static Optional<int[]> printIndices(int[] numArray, int sum) {
        Map<Integer, Integer> previouslyProcessed = new HashMap<>();
        for (int i = 0; i < numArray.length; i++) {
            // Get the difference needed to add up to the sum for this array element
            int delta = sum - numArray[i];
            // Has this value been processed already?
            if (previouslyProcessed.containsKey(delta)) {
                return Optional.of(new int[] {previouslyProcessed.get(delta), i});
            }
            // Store the value, and its index
            previouslyProcessed.put(numArray[i], i);
        }
        // The sum could not be constructed from any of the values in the array
        return Optional.empty();
    }
}
