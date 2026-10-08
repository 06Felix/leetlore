class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        int[] ans = new int[n];
        int[][] sArr = new int[n][];
        for(int i = 0; i < n; i++)
            sArr[i] = new int[]{nums[i], i};
        Arrays.sort(sArr, (a, b) -> a[0] - b[0]);
        Map<Integer, Deque<Integer>> m = new HashMap<>();
        int[] grp = new int[n];
        int gN = 0;
        grp[sArr[0][1]] = gN;
        m.put(gN, new ArrayDeque<>());
        m.get(gN).addLast(sArr[0][0]);
        for(int i = 1 ; i < n ; i++){
            if(sArr[i][0] - m.get(gN).getLast() <= limit){
                m.get(gN).addLast(sArr[i][0]);
                grp[sArr[i][1]] = gN;
            }
            else{
                gN++;
                m.put(gN, new ArrayDeque<>());
                m.get(gN).addLast(sArr[i][0]);
                grp[sArr[i][1]] = gN;
            }
        }
        for(int i = 0 ; i < n ; i++)
            ans[i] = m.get(grp[i]).pollFirst();
        return ans;
    }
}
