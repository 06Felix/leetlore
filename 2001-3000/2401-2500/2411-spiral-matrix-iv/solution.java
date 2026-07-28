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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans = new int[m][n];
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for(int[] rw : ans)
            Arrays.fill(rw, -1);
        int x = 0, y = 0, d = 0;

        for (ListNode curr = head; curr != null; curr = curr.next) {
            ans[x][y] = curr.val;
            if (x + dirs[d][0] < 0 || x + dirs[d][0] == m || y + dirs[d][1] < 0 || y + dirs[d][1] == n || ans[x + dirs[d][0]][y + dirs[d][1]] != -1)
                d = (d + 1) % 4;
                x += dirs[d][0];
                y += dirs[d][1];
        }

        return ans;
    }
}
