class Solution {
    public int maxOperations(int[] arr) {
        Map<Integer,Integer> m = new HashMap<>();
        int ans = 1;
        int sc = arr[0] + arr[1];
        for(int i=3;i<arr.length;i+=2){
            if(arr[i] + arr[i-1] != sc)
                break;
            ans++;
        }
        return ans;
    }
}
