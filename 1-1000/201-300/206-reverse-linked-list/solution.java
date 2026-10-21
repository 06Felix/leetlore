class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode ans = null;
        while(head != null){
            ListNode t = head.next;
            head.next = ans;
            ans = head;
            head = t;
        }
        return ans;
    }
}
