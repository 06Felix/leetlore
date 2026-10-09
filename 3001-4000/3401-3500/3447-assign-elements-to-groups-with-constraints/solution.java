class Solution {
    public int[] assignElements(int[] groups, int[] elements) {
        int[] id = new int[100001];
        int n = elements.length;
        for(int i = 0 ; i < n ; i++)
            if(id[elements[i]] == 0)
                id[elements[i]] = i + 1;
        int m = groups.length;
        int[] ans = new int[m];
        for(int i = 0 ; i < m ; i++)
            ans[i] = find(id, groups[i]);
        return ans;
    }
    private static int find(int[] id, int grp){
        int mn = Integer.MAX_VALUE;
        for(int div = 1 ; div * div <= grp ; div++){
            if(grp % div == 0){
                if(id[div] > 0)
                    mn = Math.min(mn, id[div]);
                if(id[grp / div] > 0)
                    mn = Math.min(mn, id[grp / div]);
            }
        }
        return mn == Integer.MAX_VALUE ? -1 : mn - 1;
    }
}
