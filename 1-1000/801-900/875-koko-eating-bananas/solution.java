class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // sp -> 5
        // 21 22 23 24 25
        // 25 26 27 28 29

        // (b + sp - 1) / sp;

        // sp -> 4
        // 17 18 19 20
        // 20 21 22 23


        // 1 2 4 6    g -> 5

        // 1 -> 13
        // 2 -> 7
        // 3 -> 6
        // 4 -> 5
        // 5 -> 5
        // 6 -> 4
        // 7 -> 4
        // 10 -> 4
        // 500 -> 4
        // inf -> 4

        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        while(l < r){
            int m = (l + r) / 2;
            if(findTime(piles, m) > h)
                l = m + 1;
            else
                r = m;
        }
        // for(int i = 1 ; i <= mx ; i++)
        //     if(findTime(piles, i) <= h)
        //         return i;
        return l;
    }
    // 1 2 3 4 5 6  g->15           l = 1, r = 6, m = 3
    // 3 -> 9                       l = 1, r = 3, m = 2
    // 2 -> 12                      l = 1, r = 2 m = 1
    //                              l = 2, r = 2

    private long findTime(int[] arr, int sp){
        long t = 0;
        for(int x : arr)
            t += ((long)x + sp - 1) / sp;
        return t;
    }
}
