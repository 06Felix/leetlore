class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] ct = new int[1001];
        for(int i : arr1)
            ct[i]++;
        int[] ans = new int[arr1.length];
        int i = 0;
        for(int n : arr2){
            while(ct[n] > 0){
                ans[i] = n;
                ct[n]--;
                i++;
            }
        }
        for(int j = 0; j < ct.length ; j++){
            while(ct[j] > 0){
                ans[i] = j;
                ct[j]--;
                i++;
            }
        }
        return ans;
    }
}
