public class LeetCode3163 {
    public static void main(String[] args) {

    }

    public String compressedString(String word) {
        String res = "";
        int count = 1;

        if (word == null || word.length() == 0) {
            return word;
        } else if (word.length() == 1) {
            return 1 + word;
        }
        for (int i = 1; i < word.length(); i++) {
            if (i < word.length() && word.charAt(i) == word.charAt(i - 1)) {
                count++;

            } else {
                while (count > 9) {
                    res = res + 9 + word.charAt(i - 1);
                    count = count - 9;
                }
                res = res + count + word.charAt(i - 1);
                count = 1;
            }
        }
        return res;
    }
}