class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean x = false;
        while(!q.isEmpty()){
            x = !x;
            int pval = x ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            for(int i=q.size();i>0;i--){
                TreeNode tp = q.poll();
                if(x && (tp.val % 2 != 1 || tp.val <= pval))
                    return false;
                if(!x && (tp.val % 2 != 0 || tp.val >= pval))
                    return false;
                pval = tp.val;
                if(tp.left != null)
                    q.offer(tp.left);
                if(tp.right != null)
                    q.offer(tp.right);
            }
        }
        return true;
    }
}
