/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();
        Queue<TreeNode> level = new ArrayDeque<>(); 

        if (root != null) {
            level.add(root);
        }

        while (!level.isEmpty()) {
            List<Integer> curr = new ArrayList<>(); 
            int size = level.size(); 
            for (int i = 0; i < size; i++) {
                TreeNode temp = level.poll();
                curr.add(temp.val);
                if (temp.left != null) level.add(temp.left);
                if (temp.right != null) level.add(temp.right);
            }
            output.add(curr);
        }
        Collections.reverse(output);
        return output; 
    }
}
