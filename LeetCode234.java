import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class LeetCode234 {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode ptr = head;

        while (ptr != null) {
            st.push(ptr.val);
            ptr = ptr.next;
        }

        ptr = head;
        while (!st.isEmpty()) {
            int val1 = ptr.val;
            int val2 = st.pop();

            if (val1 != val2) {
                return false;
            }
            ptr = ptr.next;
        }
        return true;
    }
}
