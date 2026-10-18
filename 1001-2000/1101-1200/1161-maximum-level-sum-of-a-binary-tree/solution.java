class Solution {
    public int maxLevelSum(TreeNode root) {
        int ans = 0, mS = Integer.MIN_VALUE, lvl = 0;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()){
            int s = 0;
            lvl++;
            for(int i = q.size() ; i > 0 ; i--){
                TreeNode t = q.poll();
                s += t.val;
                if(t.left != null)
                    q.offer(t.left);
                if(t.right != null)
                    q.offer(t.right);
            }
            if(s > mS){
                mS = s;
                ans = lvl;
            }
        }
        return ans;
    }
}
