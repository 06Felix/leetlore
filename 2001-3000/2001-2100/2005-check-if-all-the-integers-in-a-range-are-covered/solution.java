class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] ct = new int[51];
        for(int[] range : ranges)
            for(int i = range[0] ; i <= range[1] ; i++)
                ct[i]++;
        for(int i = left ; i <= right ; i++)
            if(ct[i] == 0)
                return false;
        return true;
    }
}
