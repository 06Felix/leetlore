/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right)
            return head;
        ListNode dum = new ListNode(0, head);
        ListNode prv = dum;
        for (int i = 0; i < left - 1; i++)
            prv = prv.next;
        ListNode tl = prv.next;
        for (int i = left; i < right; i++) {
            ListNode cc = tl.next;
            tl.next = cc.next;
            cc.next = prv.next;
            prv.next = cc;
        }
        return dum.next;
    }
}
