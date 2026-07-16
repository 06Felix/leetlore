class Solution {
public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        qSort(nums,0,nums.length-1,ans);
        return ans;
    }
    private void qSort(int[] nums,int a,int b,List<Integer> ans) {
        int len = nums.length / 3;
        if (b - a < len)
            return;
        int l = a;
        int r = b;
        int i = a+1;
        while(r>=i){
            if (nums[l] > nums[i]) {
                swap(nums, l, i);
                i++;
                l++;
            }
            else if(nums[l] < nums[i]){
                if(nums[i] > nums[r])
                    swap(nums, r, i);
                r--;
            }
            else
                i++;
        }
        if (r - l >= len)
            ans.add(nums[r]);
        qSort(nums, a, l - 1, ans);
        qSort(nums, r + 1, b, ans);
    }

    private void swap(int[] nums, int x, int y) {
        int t = nums[x];
        nums[x] = nums[y];
        nums[y] = t;
    }

}
