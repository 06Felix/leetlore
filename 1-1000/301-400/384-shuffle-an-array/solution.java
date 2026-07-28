class Solution {
    private int[] nums;
    Random random = new Random();
    public Solution(int[] nums) {
        this.nums = nums;
    }
    
    public int[] reset() {
        return nums;
    }
    
    public int[] shuffle() {
        int[] arr = nums.clone();
        for(int i = nums.length - 1 ; i >= 1 ; i--){
            int j = random.nextInt(i + 1);
            swap(i ,j ,arr);
        }
        return arr;
    }
    private void swap(int i, int j, int[] arr){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
