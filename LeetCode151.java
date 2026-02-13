public class LeetCode151 {
    public static void main(String[] args) {
        String s = "I Love my       India";

        reverseWords(s);
    }

    public static void reverseWords(String s) {

        String[] wordArray = s.split(" +");

        String reversedString = "";

        for (int i = wordArray.length - 1; i >= 0; i--) {
            reversedString = reversedString + wordArray[i] + " ";
        }
        System.out.println(reversedString.trim());

        // return s;
    }
}
