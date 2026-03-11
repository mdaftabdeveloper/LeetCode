import java.util.Stack;

public class LeetCode232 {
    private Stack<Integer> main;
    private Stack<Integer> helper;

    public LeetCode232() {
        main = new Stack<>();
        helper = new Stack<>();
    }

    public void push(int x) {
        while (main.size() > 0) {
            helper.push(main.pop());
        }
        main.push(x);
        while (helper.size() > 0) {
            main.push(helper.pop());
        }
    }

    public int pop() {
        return main.pop();
    }

    public int peek() {
        return main.peek();
    }

    public boolean empty() {
        if (main.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
