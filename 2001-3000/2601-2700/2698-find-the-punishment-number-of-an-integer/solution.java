class Solution {
    private boolean dfs(char[] num, int target, int id, int n){
        if(id == n)
            return target == 0;
        int sum = 0;
        for(int i = id ; i < n ; i++){
            sum = (sum * 10) + (num[i] - '0');
            if(sum > target)
                return false;
            if(dfs(num, target - sum, i + 1, n))
                return true;
        }
        return false;
    }
    public int punishmentNumber(int num) {
        int ans = 1;
        for(int i = 2 ; i <= num ; i++){
            int sq = i * i;
            // System.out.println(sq);
            char[] arr = String.valueOf(sq).toCharArray();
            if(dfs(arr, i, 0, arr.length))
                ans += sq;
        }
        return ans;
    }
}
