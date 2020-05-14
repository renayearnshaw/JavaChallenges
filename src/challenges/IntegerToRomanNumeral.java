package challenges;

import java.util.Optional;

/**
 * The Roman Numeral challenge:
 *   <p>Write a short program that converts an integer into a roman numeral.</p>
 *   <p>The value of the integer is limited to between one and three thousand.</p>
 *
 * @author Renay Earnshaw
 */
public class IntegerToRomanNumeral {
    private static final String[] UNITS = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    private static final String[] TENS = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static final String[] HUNDREDS = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static final String[] THOUSANDS = {"", "M", "MM", "MMM"};

    public static Optional<String> map(int in) {
        // Chack that the limits haven't been exceeded
        if (in < 1 || in > 3000) {
            return Optional.empty();
        }

        return Optional.of(
                THOUSANDS[in/1000]
                + HUNDREDS[(in % 1000) / 100]
                + TENS[(in % 100) / 10]
                + UNITS[in % 10]);

    }
}
