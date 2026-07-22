class Solution {
    public int findDuplicate(int[] nums) {
       boolean arr[] =new boolean[nums.length];
       for(int num : nums)
            if(arr[num]==false)
                arr[num]=true;
            else
                return num;
       return 0;
    }
}
