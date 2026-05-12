class Solution {
    public ListNode deleteMiddle(ListNode head) {
        // Edge Case: If the list has only one node, deleting it returns null
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        // Move fast pointer 2x and slow pointer 1x
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // 'slow' is now the middle node. 
        // Point 'prev' to the node after 'slow' to delete it.
        prev.next = slow.next;

        return head;
    }
}