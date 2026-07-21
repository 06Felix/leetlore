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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prv = head;
        head = head.next;
        int nn = 1;
        int mn = Integer.MAX_VALUE, ft = -1, lt = -1;
        while(head.next != null){
            nn++;
            int v = head.next.val;
            if((prv.val > head.val && v > head.val) || (prv.val < head.val && v < head.val)){
                if(ft != -1)
                    mn = Math.min(mn, nn - lt);
                else
                    ft = nn;
                lt = nn;
            }
            prv = head;
            head = head.next;
        }
        if(ft == lt)
            return new int[]{-1, -1};
        return new int[]{mn, lt - ft};
    }
}
