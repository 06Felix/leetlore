class Solution {
    public int maxFrequency(int[] nums, int k) {
        int n = nums.length;
        int[] ct = new int[51];
        int con = 0, kc = 0;
        for(int x : nums)
            if(x == k)
                kc++;
        int mx = 0;
        for(int i = 1 ; i <= 50 ; i++)
            mx = Math.max(mx, find(nums, i, k));
        return mx + kc;        
    }
    private int find(int[] arr, int a, int k){
        int ans = 0, cur = 0;
        for(int x : arr){
            if(x == k)
                cur--;
            else if(x == a)
                cur++;
            if(cur < 0)
                cur = 0;
            ans = Math.max(ans, cur);
        }
        return ans;
    }
}
