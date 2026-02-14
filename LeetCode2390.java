import java.util.Stack;

public class LeetCode2390 {
    public static void main(String[] args) {

    }

    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (c != '*') {
                st.push(c);
            } else {
                st.pop();
            }
        }

        String res = "";
        while (!st.isEmpty()) {
            res = st.pop() + res;
        }
        return res;

    }
}
