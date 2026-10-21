class FenwickTree {
    private int[] tree;

    FenwickTree(int n) {
        tree = new int[n + 1];
    }

    void add(int i, int delta) {
        while (i < tree.length) {
            tree[i] += delta;
            i += i & -i;
        }
    }

    int query(int i) {
        int sum = 0;
        while (i > 0) {
            sum += tree[i];
            i -= i & -i;
        }
        return sum;
    }
}

class Solution {

    public int reversePairs(int[] nums) {
        if (nums.length == 0)
            return 0;

        Map<Long, Integer> ranks = getRanks(nums);
        FenwickTree tree = new FenwickTree(ranks.size());
        int ans = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            long num = nums[i];
            ans += tree.query(ranks.get(num) - 1);
            tree.add(ranks.get(num * 2), 1);
        }

        return ans;
    }

    private Map<Long, Integer> getRanks(int[] nums) {
        Set<Long> sorted = new TreeSet<>();
        for (int num : nums) {
            sorted.add((long) num);
            sorted.add((long) num * 2L);
        }

        Map<Long, Integer> ranks = new HashMap<>();
        int rank = 0;
        for (long val : sorted)
            ranks.put(val, ++rank);
        return ranks;
    }
}
