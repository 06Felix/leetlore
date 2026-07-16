class Solution {
    public int busyStudent(int[] sT, int[] eT, int qT) {
        int ans = 0;
        for(int i=0;i<sT.length;i++){
            if(sT[i] <= qT && eT[i] >= qT)
                ans++;
        }
        return ans;
    }
}
