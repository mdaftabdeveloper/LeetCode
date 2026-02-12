public class LeetCode1796 {
    public static void main(String[] args) {

    }

    public int secondHighest(String s) {

        int max = -1;
        int secondMax = -1;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                int digit = c - '0';

                if (digit > max) {
                    secondMax = max;
                    max = digit;
                } else if (digit < max && digit > secondMax) {
                    secondMax = digit;
                }
            }
        }
        return secondMax;

    }
}
