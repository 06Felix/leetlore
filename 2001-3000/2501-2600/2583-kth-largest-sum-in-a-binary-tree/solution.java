class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<Long> ans = new PriorityQueue<>(Collections.reverseOrder());
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()){
            long ts = 0;
            for(int i = q.size() ; i > 0 ; i--){
                TreeNode cur = q.poll();
                ts += cur.val;
                if(cur.left != null)
                    q.offer(cur.left);
                if(cur.right != null)
                    q.offer(cur.right);
            }
            ans.offer(ts);
        }
        if(ans.size() < k)
            return -1;
        while(--k > 0)
            ans.poll();
        return ans.poll();
    }
}
