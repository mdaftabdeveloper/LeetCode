import java.util.Stack;

public class LeetCode155 {

    private Stack<Integer> st;
    private Stack<Integer> min;

    public LeetCode155() {
        st = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val) {

        if (st.size() == 0 || min.peek() >= val) {
            min.push(val);
        }

        st.push(val);
    }

    public void pop() {

        int x = st.pop();
        int y = min.peek();

        if (x == y) {
            min.pop();
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }
}