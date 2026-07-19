class Solution {
    public String[] findRelativeRanks(int[] score) {
      int n = score.length;
        String[] res = new String[n];
        int[] ss = Arrays.copyOf(score,n);
        Arrays.sort(ss);
        for (int i = 0; i < n; i++) {
            int rank = n - Arrays.binarySearch(ss, score[i]);
            switch (rank) {
                case 1: res[i] = "Gold Medal"; break;
                case 2: res[i] = "Silver Medal"; break;
                case 3: res[i] = "Bronze Medal"; break;
                default: res[i] = String.valueOf(rank); break;
            }
        }
        
        return res;
    }
}
