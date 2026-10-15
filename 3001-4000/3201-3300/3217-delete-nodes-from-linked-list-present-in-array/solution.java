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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode ans = new ListNode(-1, head);
        ListNode cur = ans;
        Set<Integer> s = new HashSet<>();
        for(int n : nums)
            s.add(n);
        while(cur != null && cur.next != null){
            while(cur.next != null && s.contains(cur.next.val))
                cur.next = cur.next.next;
            cur = cur.next;
        }
        return ans.next;
    }
}
