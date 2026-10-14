
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(temp);
        return mergeTwoSortedLists(left, right);
    }

    public ListNode mergeTwoSortedLists(ListNode first, ListNode second) {
        ListNode head = new ListNode();
        ListNode temp = head;
        while (first != null && second != null) {
            if (first.val < second.val) {
                temp.next = first;
                first = first.next;
            } else {
                temp.next = second;
                second = second.next;
            }
            temp = temp.next;
        }
        temp.next = (first == null) ? second : first;
        return head.next;
    }
}
