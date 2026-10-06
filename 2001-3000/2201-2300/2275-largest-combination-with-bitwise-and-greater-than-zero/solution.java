class Solution {
    public int largestCombination(int[] candidates) {
        int ans = 0;
        for(int i = 0 ; i < 24 ; i++){
            int ct = 0;
            for(int num : candidates)
                if(((num >> i) & 1) == 1)
                    ct++;
            ans = Math.max(ans, ct);
        }
        return ans;
    }
}
