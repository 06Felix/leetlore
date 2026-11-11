class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long only = (long) need1 * cost1 + (long) need2 * cost2;
        long all = (long) Math.max(need1, need2) * costBoth;
        int both = Math.min(need1, need2);

        long mix = (long) both * costBoth
            + (long) (need1 - both) * cost1
            + (long) (need2 - both) * cost2;

        return Math.min(only, Math.min(mix, all));
    }
}
