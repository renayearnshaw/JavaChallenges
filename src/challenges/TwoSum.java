package challenges;

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
    public static int[] printIndices(int[] numArray, long sum) {
        for (int i = 0; i < numArray.length; i++) {
            // For each element in the array, try all the other elements
            for (int j = 0; j < numArray.length; j++) {
                if (i == j) continue; // You may not use the same element twice
                if (numArray[i] + numArray[j] == sum) {
                    // The solution has been found
                    return new int[] {i, j};
                }
            }
        }
        // No solution was found
        return null;
    }
}
