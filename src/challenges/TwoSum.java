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
        Map<Integer, Integer> arrayContents = new HashMap<>();
        int delta;
        for (int i = 0; i < numArray.length; i++) {
            delta = sum - numArray[i];
            if (arrayContents.containsKey(delta)) {
                return Optional.of(new int[] {arrayContents.get(delta), i});
            }
            arrayContents.put(numArray[i], i);
        }
        return Optional.empty();
    }
}
