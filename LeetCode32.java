public class LeetCode32 {
    public static void main(String[] args) {

    }

    public int longestValidParentheses(String s) {
        int left = 0, right = 0, max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                left++;
            else
                right++;

            if (left == right) {
                int len = left * 2;
                if (len > max)
                    max = len;
            } else if (right > left) {
                left = 0;
                right = 0;
            }
        }

        left = 0;
        right = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(')
                left++;
            else
                right++;

            if (left == right) {
                int len = right * 2;
                if (len > max)
                    max = len;
            } else if (left > right) {
                left = 0;
                right = 0;
            }
        }

        return max;
    }
}
