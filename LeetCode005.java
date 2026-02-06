class LeetCode005 {
    public static void main(String[] args) {

    }

    public String longestPalindrome(String s) {
        String maxSubstring = "";

        for (int i = 0; i < s.length(); i++) {
            String even = expand(s, i, i + 1);
            String odd = expand(s, i, i);

            if (odd.length() > even.length() && odd.length() > maxSubstring.length()) {
                maxSubstring = odd;
            } else if (even.length() > odd.length() && even.length() > maxSubstring.length()) {
                maxSubstring = even;
            }
        }
        return maxSubstring;
    }

    public String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return s.substring(left + 1, right);
    }
}