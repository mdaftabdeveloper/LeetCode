import java.util.LinkedList;
import java.util.Queue;

public class LeetCode225 {

    public static void main(String[] args) {

    }

    private Queue<Integer> main;
    private Queue<Integer> helper;

    public LeetCode225() {
        main = new LinkedList<>();
        helper = new LinkedList<>();
    }

    public void push(int x) {

        while (main.size() > 0) {
            helper.add(main.remove());
        }

        main.add(x);

        while (helper.size() > 0) {
            main.add(helper.remove());
        }
    }

    public int pop() {
        return main.remove();
    }

    public int top() {
        return main.peek();
    }

    public boolean empty() {
        if (main.size() == 0) {
            return true;
        }
        return false;
    }
}