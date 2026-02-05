public class LeetCode1768 {
    public static void main(String[] args) {

    }

    public String mergeAlternately(String word1, String word2) {
        String result = "";

        int pointer1 = 0;
        int pointer2 = 0;

        int min = Math.min(word1.length(), word2.length());

        for (int i = 0; i < min; i++) {
            result = result + word1.charAt(pointer1);
            result = result + word2.charAt(pointer2);
            pointer1++;
            pointer2++;
        }

        if (word1.length() < word2.length()) {
            while (pointer2 < word2.length()) {
                result = result + word2.charAt(pointer2);
                pointer2++;
            }
        } else {
            while (pointer1 < word1.length()) {
                result = result + word1.charAt(pointer1);
                pointer1++;
            }
        }
        return result;
    }
}
