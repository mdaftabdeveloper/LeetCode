
public class LeetCode021 {
    public static void main(String[] args) {

    }

    public class ListNode {
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode itr = new ListNode(-1);
        ListNode ans = itr;
        ListNode ptr1 = list1;
        ListNode ptr2 = list2;

        while (ptr1 != null && ptr2 != null) {
            if (ptr1.val < ptr2.val) {
                itr.next = ptr1;
                ptr1 = ptr1.next;
            } else {
                itr.next = ptr2;
                ptr2 = ptr2.next;
            }
            itr = itr.next;
        }

        if (ptr1 == null) {
            itr.next = ptr2;
        } else {
            itr.next = ptr1;
        }
        return ans.next;

    }
}
