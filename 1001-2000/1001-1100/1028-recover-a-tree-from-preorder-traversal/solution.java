class Solution {
    public TreeNode recoverFromPreorder(String traversal) {
        return recover(traversal, 0);
    }

    private int i = 0;

    private TreeNode recover(String traversal, int depth) {
        int nDashes = 0;
        while (i + nDashes < traversal.length() && traversal.charAt(i + nDashes) == '-')
            ++nDashes;
        if (nDashes != depth)
            return null;

        i += depth;
        int start = i;
        while (i < traversal.length() && Character.isDigit(traversal.charAt(i)))
            ++i;
        return new TreeNode(Integer.valueOf(traversal.substring(start, i)),
                            recover(traversal, depth + 1),
                            recover(traversal, depth + 1));
    }
}
