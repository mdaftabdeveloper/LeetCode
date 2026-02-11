public class LeetCode647 {
    public static void main(String[] args) {

    }

    public int countSubstrings(String s) {
        int finalCount = 0;
        for (int i = 0; i < s.length(); i++) {
            finalCount += expandAroundCenter(s, i, i);
            finalCount += expandAroundCenter(s, i, i + 1);
        }
        return finalCount;
    }

    public int expandAroundCenter(String s, int start, int end) {
        int count = 0;
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            count++;
            start--;
            end++;
        }
        return count;
    }

}
