public class LeetCode2108 {
    public static void main(String[] args) {

    }

    public String firstPalindrome(String[] words) {
        for (String s : words) {
            if (isPalindrome(s)) {
                return s;
            }
        }
        return "";
    }

    public boolean isPalindrome(String str) {
        int start = 0;
        int end = 0;

        if (str.length() % 2 == 0) {
            end = str.length() / 2;
            start = end - 1;
        } else {
            start = str.length() / 2;
            end = start;
        }

        while (start >= 0 && end < str.length() && str.charAt(start) == str.charAt(end)) {
            start--;
            end++;
        }

        if (start == -1 && end == str.length()) {
            return true;
        } else {
            return false;
        }

    }
}