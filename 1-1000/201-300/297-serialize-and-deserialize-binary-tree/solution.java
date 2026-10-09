public class Codec {
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        preorder(root, sb);
        return sb.toString();
    }

    public TreeNode deserialize(String data) {
        String[] vals = data.split(" ");
        // Queue<String> q = new ArrayDeque<>();
        // for(String x : vals)
        //     q.offer(x);
        return preorder(vals);
    }

    private void preorder(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("n ");
            return;
        }
        sb.append(root.val).append(" ");
        preorder(root.left, sb);
        preorder(root.right, sb);
    }
    private int id = 0;
    private TreeNode preorder(String[] arr) {
        String s = arr[id++];
        if (s.equals("n"))
            return null;
        TreeNode root = new TreeNode(Integer.parseInt(s));
        root.left = preorder(arr);
        root.right = preorder(arr);
        return root;
    }
}
