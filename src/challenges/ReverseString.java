package challenges;

/**
 * The Reverse a String challenge:
 *   <p/><p>Write a short program that reverses a string. This is done in three ways.</p>
 *   <p>- Using low-level string manipulation.</p>
 *   <p>- Using low-level string iteration, but building the new string with StringBuilder.</p>
 *   <p>- Using the StringBuilder API. This is what you'd do in the real world.</p>
 *
 * @author Renay Earnshaw
 */
public class ReverseString {
    /**
     * The low-level version of the method.
     *
     * @param in the string to reverse
     */
    public static String reverseManually(String in) {
        String out = "";
        for (int i = in.length() - 1; i >= 0; i--) {
            // Because strings are immutable, every character appended
            // results in a new string object being created.
            // This is inefficient.
            out += in.charAt(i);
        }
        return out;
    }

    /**
     * The low-level version of the method, but using StringBuilder to
     * build the new string - thus avoiding multiple string objects.
     *
     * @param in the string to reverse
     */
    public static String reverseManuallyWithStringBuilder(String in) {
        StringBuilder out = new StringBuilder();
        for (int i = in.length() - 1; i >= 0; i--) {
            out.append(in.charAt(i));
        }
        return out.toString();
    }

    /**
     * The version of the method that uses the StringBuilder API in full.
     *
     * @param in the string to reverse
     */
    public static String reverseWithStringBuilder(String in) {
        return new StringBuilder(in).reverse().toString();
    }
}
