public class LeetCode1897 {
    public static void main(String[] args) {

    }

    public boolean makeEqual(String[] words) {

        int freq[] = new int[26];

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                int idx = (int) (ch - 'a');
                freq[idx] = freq[idx] + 1;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] % words.length != 0) {
                return false;
            }
        }
        return true;
    }
}
