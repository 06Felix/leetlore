class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        int[] i = {0};
        return bst(preorder, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public TreeNode bst(int[] preorder, int[] i, int min, int max){
        if(i[0] == preorder.length || preorder[i[0]] < min || preorder[i[0]] > max){
            return null;
        }

        TreeNode root = new TreeNode(preorder[i[0]]);
        i[0]++;
        root.left = bst(preorder, i, min, root.val);
        root.right = bst(preorder, i, root.val, max);

        return root;
    }
}
