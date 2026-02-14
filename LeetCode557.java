import java.util.ArrayList;
import java.util.List;

public class LeetCode557 {
    public static void main(String[] args) {
        System.out.println(reverseWords("My Name is Khan"));
    }

    public static String reverseWords(String s) {

        List<String> list = new ArrayList<>();
        String words[] = s.split(" +");

        for (String word : words) {
            String revWord = "";
            for (int i = 0; i < word.length(); i++) {
                revWord = word.charAt(i) + revWord;
            }
            list.add(revWord);
            revWord = "";
        }
        String res = "";
        for (String revWord : list) {
            res = res + revWord + " ";
        }
        return res.trim();

    }
}
