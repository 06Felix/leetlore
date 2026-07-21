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
    public ListNode mergeNodes(ListNode head) {
        ListNode dum = new ListNode(-1);
        ListNode cur = dum;
        head = head.next;
        while(head != null){
            int sum = 0;
            while(head.val != 0){
                sum += head.val;
                head = head.next;
            }
            cur.next = new ListNode(sum);
            cur = cur.next;
            head = head.next;
        }
        return dum.next;
    }
}
