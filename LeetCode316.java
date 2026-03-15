import java.util.Stack;

public class LeetCode316 {
    public static void main(String[] args) {

    }

    public String removeDuplicateLetters(String s) {
        // create a array to store last index of each letter
        int lastIndex[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = (int) (ch - 'a');
            lastIndex[index] = i;
        }

        // array to check a letter is already present or not
        boolean present[] = new boolean[26];

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = (int) (ch - 'a');

            if (present[index] == false) {
                while (st.size() > 0 && st.peek() > ch && lastIndex[(int) (st.peek() - 'a')] > i) {
                    present[(int) (st.peek() - 'a')] = false;
                    st.pop();
                }
                st.push(ch);
                present[index] = true;
            }
        }

        StringBuilder res = new StringBuilder("");
        while (st.size() > 0) {
            res.append(st.pop());
        }

        return res.reverse().toString();
    }
}
