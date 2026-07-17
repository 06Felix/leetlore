class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        if(head == null)
            return head;
        ListNode cur = head;
        int sum=0;
        while(cur != null){
            sum += cur.val;
            if(sum==0){
                head = cur.next;
                return removeZeroSumSublists(head);
            }
            cur = cur.next;
        }
        head.next = removeZeroSumSublists(head.next);
        return head;
    }
}
