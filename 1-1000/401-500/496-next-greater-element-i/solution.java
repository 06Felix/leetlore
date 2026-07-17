class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        int[] indx=new int[10001];
        for(int i=0;i<nums2.length;i++){
            indx[nums2[i]]=i;
        }
        for(int i=0;i<nums1.length;i++){
            ans[i]=find(nums2,indx[nums1[i]]);
        }
        return ans;
    }
    public int find(int[] n2,int cur){
        for(int i=cur+1;i<n2.length;i++){
            if(n2[i]>n2[cur]){
                return n2[i];
            }
        }
        return -1;
    }
}
