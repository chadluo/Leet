public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head, fast = slow.next;
        while (true) {
            if (slow == fast)
                return true;
            if (fast == null || fast.next == null || fast.next.next == null)
                return false;
            slow = slow.next;
            fast = fast.next.next;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.hasCycle(new ListNode(0)));
        System.out.println(s.hasCycle(new ListNode(0, new ListNode(1))));
        ListNode n = new ListNode(0);
        n.next = n;
        System.out.println(s.hasCycle(n));
        ListNode m = new ListNode(0, new ListNode(1));
        m.next.next = m;
        System.out.println(s.hasCycle(m));
    }
}
