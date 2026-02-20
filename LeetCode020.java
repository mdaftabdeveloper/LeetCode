import java.util.Stack;

public class LeetCode020 {
    public static void main(String[] args) {

    }

    public boolean isValid(String str) {
        Stack<Character> st = new Stack<>();
        // traverse each character of string
        for (int i = 0; i < str.length(); i++) {
            // if the characters are opening parathesis then push it
            if (str.charAt(i) == '[' || str.charAt(i) == '{' || str.charAt(i) == '(') {
                st.push(str.charAt(i));
            } else { // if closing braces then compare with it top
                // if matches the incoming braces with top then pop the braces
                // this will empty the stack if the braces are balanced otherwise not
                if (!st.isEmpty() && ((st.peek() == '[') && (str.charAt(i) == ']')
                        || (st.peek() == '{') && (str.charAt(i) == '}')
                        || (st.peek() == '(') && (str.charAt(i) == ')'))) {
                    st.pop();
                } else {
                    // otherwise return false
                    return false;
                }
            }
        }
        // if stack is emtpy it will return true otherwise false
        return st.empty();
    }
}
