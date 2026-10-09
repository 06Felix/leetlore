class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ; j < n ; j++){
                int p = nums[i] * nums[j];
                map.merge(p, 1, Integer :: sum);
                ans += (map.get(p) - 1) * 8;
            }
        }
        return ans;
    }
}
