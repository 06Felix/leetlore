class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        int[] lis1 = LIS(nums, n);
        int[] lis2 = reverse(LIS(reverse(nums, n), n), n);
        int ans = 0;
        for(int i = 1 ; i < n - 1 ; i++)
            if(lis1[i] > 1 && lis2[i] > 1)
                ans = Math.max(ans, lis1[i] + lis2[i] - 1);
        return n - ans;
    }
    private int[] LIS(int[] nums, int n){
        int[] lis = new int[n];
        List<Integer> cur = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            int num = nums[i];
            if(cur.size() == 0 || num > cur.get(cur.size() - 1))
                cur.add(num);
            else{
                int id = Collections.binarySearch(cur, num);
                if(id < 0)
                    id = -(id + 1);
                cur.set(id, num);
            }
            lis[i] = cur.size();
        }
        return lis;
    }
    private int[] reverse(int[] arr, int n){
        int l = 0, r = n - 1;
        while(l < r){
            int t = arr[l];
            arr[l++] = arr[r];
            arr[r--] = t;
        }
        return arr;
    }
}
