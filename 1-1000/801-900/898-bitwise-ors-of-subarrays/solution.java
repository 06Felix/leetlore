class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> ans = new HashSet<>();
        Set<Integer> prv = new HashSet<>();
        for (int num : arr) {
            Set<Integer> cur = new HashSet<>();
            cur.add(num);
            for (int x : prv)
                cur.add(x | num);
            prv = cur;
            ans.addAll(prv);
        }
        return ans.size();
    }
}
