class Solution {
    public int heightChecker(int[] heights) {
        int[] std = heights.clone();
        Arrays.sort(std);
        int ans = 0, i = 0, n = heights.length;
        while(i < n)
            if(heights[i] != std[i++])
                ans++;
        return ans;
    }
}
