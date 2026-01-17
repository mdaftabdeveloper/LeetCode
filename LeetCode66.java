public class LeetCode66 {
    public static void main(String[] args) {

    }

    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        }

        digits[digits.length - 1] = 0;

        for (int i = digits.length - 2; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                return digits;
            }
            digits[i] = 0;
        }

        int result[] = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
