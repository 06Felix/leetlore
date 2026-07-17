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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int i = 0;
        ListNode t = list1;
        while(i++ < a - 1)
            t = t.next;
        ListNode f = t;
        while(i++ < b + 2)
            t = t.next;
        ListNode r = t;
        ListNode h = list2;
        ListNode tl = list2;
        while(tl.next != null)
            tl = tl.next;
        f.next = h;
        tl.next = r;
        return list1;
    }
}
