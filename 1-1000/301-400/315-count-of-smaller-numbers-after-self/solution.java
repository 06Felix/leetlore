    class FW{
        private int[] sums;
        public FW(int n){
            sums = new int[n + 1];
        }
        public void add(int i, int val){
            while(i < sums.length){
                sums[i] += val;
                i += (i & -i);
            }
        }
        public int get(int i){
            int ans = 0;
            while(i > 0){
                ans += sums[i];
                i -= (i & -i);
            }
            return ans;
        }
    }

    class Solution {
        public List<Integer> countSmaller(int[] nums) {
            List<Integer> ans = new ArrayList<>();
            int mn = Integer.MAX_VALUE;
            int mx = Integer.MIN_VALUE;
            for(int n : nums){
                mn = Math.min(mn, n);
                mx = Math.max(mx, n);
            }
            int df = -mn + 1;
            FW tree = new FW(mx + df + 1);
            for(int i = nums.length - 1 ; i >= 0 ; i--){
                int rk = nums[i] + df;
                ans.add(tree.get(rk - 1));
                tree.add(rk, 1);
            }
            Collections.reverse(ans);
            return ans;
        }
    }
