class Solution {
    public boolean makesquare(int[] arr) {
        int n = arr.length;
        if (n < 4)
            return false;
        int sum = 0;
        for(int x : arr)
            sum += x;
        if ((sum & 3) > 0)
            return false;
        int[] sides = new int[4];
        Arrays.fill(sides, (sum >> 2));
        Arrays.sort(arr);
        return dfs(arr, n - 1, sides);
    }
    private boolean dfs(int[] arr, int cur, int[] sides) {
        if (cur == -1){
            for(int x : sides)
                if(x > 0)
                    return false;
            return true;
        }
        for (int i = 0; i < 4; ++i) {
            if (arr[cur] > sides[i])
                continue;
            sides[i] -= arr[cur];
            if (dfs(arr, cur - 1, sides))
                return true;
            sides[i] += arr[cur];
        }
        return false;
    }
}
