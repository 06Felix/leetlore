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
    public void reorderList(ListNode head) {
        head = reorder(head);
    }
    public ListNode reorder(ListNode head){
        if(head == null)
            return null;
        if(head.next == null || head.next.next == null)
            return head;
        ListNode t = head;
        ListNode t1 = head.next;
        while(t.next.next != null)
            t = t.next;
        ListNode t2 = t.next;
        t.next = null;
        t2.next = reorder(t1);
        head.next = t2;
        return head;
    }
}
