class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode oddHead = new ListNode(0);
        ListNode evenHead = new ListNode(0);
        ListNode odd = oddHead;
        ListNode even = evenHead;
        for (int i = 1; head != null; head = head.next, i++)
            if (i % 2 == 1) {
                odd.next = head;
                odd = odd.next;
            } else {
                even.next = head;
                even = even.next;
            }
        odd.next = evenHead.next;
        even.next = null;
        return oddHead.next;
    }
}
