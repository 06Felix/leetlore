class Solution {
    private static final int MOD = 1_000_000_007;
    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        hFences = Arrays.copyOf(hFences, hFences.length + 2);
        vFences = Arrays.copyOf(vFences, vFences.length + 2);
        hFences[hFences.length - 2] = 1;
        hFences[hFences.length - 1] = m;
        vFences[vFences.length - 2] = 1;
        vFences[vFences.length - 1] = n;
        Arrays.sort(hFences);
        Arrays.sort(vFences);

        Set<Integer> hGaps = getGaps(hFences);
        Set<Integer> vGaps = getGaps(vFences);
        long maxGap = -1;

        for (int hGap : hGaps)
            if (vGaps.contains(hGap))
                maxGap = Math.max(maxGap, hGap);
        return maxGap == -1 ? -1 : (int) (maxGap * maxGap % MOD);
    }

    private Set<Integer> getGaps(int[] fences) {
        Set<Integer> gaps = new HashSet<>();
        for (int i = 0; i < fences.length; ++i)
            for (int j = 0; j < i; ++j)
                gaps.add(fences[i] - fences[j]);
        return gaps;
    }
}
