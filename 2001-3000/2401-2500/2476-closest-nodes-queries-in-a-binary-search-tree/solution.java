class Solution {
    private List<Integer> l = new ArrayList<>();
    private void dfs(TreeNode t){
        if(t == null)
            return;
        dfs(t.left);
        l.add(t.val);
        dfs(t.right);
    }
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        dfs(root);
        List<List<Integer>> ans = new ArrayList<>();
        int n = l.size();
        int[] arr = new int[n];
        int i = 0;
        for(int x : l)
            arr[i++] = x;
        for(int q : queries){
            List<Integer> qAns = new ArrayList<>();
            int id = Arrays.binarySearch(arr, q);
            if(id < 0)
                id = -(id + 1);
            if(id == n){
                qAns.add(arr[n - 1]);
                qAns.add(-1);
            }
            else if(arr[id] == q){
                qAns.add(arr[id]);
                qAns.add(arr[id]);
            }
            else if(id == 0){
                qAns.add(-1);
                qAns.add(arr[0]);
            }
            else{
                qAns.add(arr[id - 1]);
                qAns.add(arr[id]);
            }
            ans.add(qAns);
        }
        return ans;
    }
}
