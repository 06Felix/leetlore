class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        int[] arr = new int[n * n + 1];
        boolean[] vis = new boolean[n * n + 1];
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(1);
        int ans = 0;
        int ix = n * n;
        boolean rev = (n % 2 == 0 ? true : false);
        for (int i = 0; i < n; i++, rev = !rev) {
            if (rev) {
                for (int j = 0; j < n; j++)
                    arr[ix--] = board[i][j];
            } else {
                for (int j = n - 1; j >= 0; j--)
                    arr[ix--] = board[i][j];
            }
        }
        vis[1] = true;
        while (!q.isEmpty()) {
            ans++;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int cur = q.poll();
                for (int dice = 1; dice <= 6; dice++) {
                    int nxt = Math.min(n * n, cur + dice);
                    nxt = (arr[nxt] == -1) ? nxt : arr[nxt];
                    if (nxt == n * n)
                        return ans;
                    if (vis[nxt])
                        continue;
                    vis[nxt] = true;
                    q.offer(nxt);
                }
            }
        }
        return -1;
    }
}
