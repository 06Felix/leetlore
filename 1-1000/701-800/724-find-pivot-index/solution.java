class Solution {
    public int pivotIndex(int[] arr) {
        int s = 0;
        for(int x : arr)
            s += x;
        int ls = 0;
        for(int i = 0 ; i < arr.length ; i++){
            s -= arr[i];
            if(i > 0)
                ls += arr[i - 1];
            if(ls == s)
                return i;
        }
        return -1;
    }
}
