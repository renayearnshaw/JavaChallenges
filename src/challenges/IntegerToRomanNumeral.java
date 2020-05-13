package challenges;

import java.util.Map;
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

        // Get the value of the units digit
        int digitValue = in % 10;
        out.insert(0, UNITS[digitValue]);
        // Get the value of the tens digit
        in /= 10;
        digitValue = in % 10;
        if (in > 0)
            out.insert(0, TENS[digitValue]);
        // Get the value of the hundreds digit
        in /= 10;
        digitValue = in % 10;
        if (in > 0)
            out.insert(0, HUNDREDS[digitValue]);
        // Get the value of the thousands digit
        in /= 10;
        digitValue = in % 10;
        if (in > 0)
            out.insert(0, THOUSANDS[digitValue]);

        return Optional.of(out.toString());
    }
}
