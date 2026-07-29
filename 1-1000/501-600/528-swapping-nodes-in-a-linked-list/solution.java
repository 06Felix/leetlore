class Solution {
  public ListNode swapNodes(ListNode head, int k) {
    ListNode p = null;
    ListNode q = null;

    for (ListNode curr = head; curr != null; curr = curr.next) {
      if (q != null)
        q = q.next;
      if (--k == 0) {
        p = curr;
        q = head;
      }
    }
    int temp = p.val;
    p.val = q.val;
    q.val = temp;
    return head;
  }
}
