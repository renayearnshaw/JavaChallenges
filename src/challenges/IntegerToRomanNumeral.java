package challenges;

import java.util.Optional;

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

        StringBuilder out = new StringBuilder();

        return Optional.of(
                THOUSANDS[in/1000 % 10]
                + HUNDREDS[in/100 % 10]
                + TENS[in/10 % 10]
                + UNITS[in % 10]);

    }
}
