class Solution {
    public int minimumOperations(TreeNode root) {
        int ans = 0;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int len = q.size();
            int j = 0;
            int[] arr = new int[len];
            Integer[] id = new Integer[len];
            for (int sz = len; sz > 0; --sz) {
                TreeNode cur = q.poll();
                id[j] = j;
                arr[j++] = cur.val;
                if (cur.left != null)
                    q.offer(cur.left);
                if (cur.right != null)
                    q.offer(cur.right);
            }
            Arrays.sort(id, (i1, i2) -> arr[i1] - arr[i2]);
            for (int i = 0; i < len; i++)
                while(id[i] != i){
                    ans++;
                    swap(id, i, id[i]);
                }
        }
        return ans;
    }
    private void swap(Integer[] id, int i, int j) {
        int t = id[i];
        id[i] = id[j];
        id[j] = t;
    }
}
