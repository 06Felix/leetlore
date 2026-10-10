class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        Set<Integer> st = new HashSet<>();
        for(int x : arr)
            st.add(x);
        int ans = 2;
        for (int i = 0 ; i < n - ans ; i++) {
            if (arr[i] * Math.pow(1.618, ans - 1) > arr[n - 1])
                break;
            for (int j = i + 1 ; j < n - ans + 1 ; j++){
                if (arr[j] * Math.pow(1.618, ans - 2) > arr[n - 1])
                    break;
                int a = arr[i];
                int b = arr[j];
                int ct = 2;
                while (st.contains(b + a)) {
                    b = b + a;
                    a = b - a;
                    ct++;
                }
                ans = Math.max(ans, ct);
            }
        }
        return ans == 2 ? 0 : ans;
    }
}
