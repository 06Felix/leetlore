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
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode original = head;
        ListNode copy = new ListNode(head.val);
        ListNode copyHead = copy;
        while (head.next != null) {
            copy.next = new ListNode(head.next.val);
            head = head.next;
            copy = copy.next;
        }
        ListNode reversed = reverseList(copyHead);
        while (original != null && reversed != null) {
            if (original.val != reversed.val)
                return false;
            original = original.next;
            reversed = reversed.next;
        }
        return true;
    }

}
