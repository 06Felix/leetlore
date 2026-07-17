class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        int[] ct = new int[n+1];
        for(int x : nums){
            if(ct[x]++ == 1)
                ans.add(x);
        }
        return ans;
    }
}
