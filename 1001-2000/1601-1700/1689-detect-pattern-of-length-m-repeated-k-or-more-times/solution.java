class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        int ct = 0;
        for(int i = m ; i < arr.length ; i++){
            ct = (arr[i] == arr[i - m]) ? ct + 1 : 0;
            if(ct == m * k - m)
                return true;
        }
        return false;
    }
}
