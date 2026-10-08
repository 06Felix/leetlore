class Solution {
    private int cyLen = 0;
    public int maximumInvitations(int[] arr) {
        int n = arr.length;
        int chLen = 0;
        int[] in = new int[n];
        int[] mxChain = new int[n];
        int[] q = new int[n];
        int l = 0, r = 0;
        for (int i = 0; i < n; i++)
            in[arr[i]]++;
        for(int i = 0 ; i < n ; i++)
            if(in[i] == 0)
                q[r++] = i;
        while (l < r) {
            int u = q[l++];
            int v = arr[u];
            if (--in[v] == 0)
                q[r++] = v;
            mxChain[v] = 1 + mxChain[u];
        }
        for(int i = 0; i < n; i++){
            if(in[i] != 0){
                in[i] = 0;
                int j = arr[i];
                int len = 1;
                while(in[j] != 0){
                    in[j] = 0;
                    len++;
                    j = arr[j];
                }
                if(len == 2)
                    chLen += mxChain[i] + mxChain[arr[i]] + 2;
                else
                    cyLen = Math.max(cyLen, len);
            }
        }
        return Math.max(chLen, cyLen);
    }
}
