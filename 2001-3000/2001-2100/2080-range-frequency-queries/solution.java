class RangeFreqQuery {
    private final Map<Integer, List<Integer>> v2idx = new HashMap<>();

    public RangeFreqQuery(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            v2idx.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
        }
    }

    public int query(int left, int right, int value) {
        List<Integer> indices = v2idx.get(value);
        if (indices == null)
            return 0;
        int i = lowerBound(indices, left);
        int j = upperBound(indices, right);
        return j - i;
    }

    private int lowerBound(List<Integer> list, int target) {
        int l = 0, r = list.size();
        while (l < r) {
            int m = (l + r) >>> 1;
            if (list.get(m) < target) 
                l = m + 1;
            else
                r = m;
        }
        return l;
    }

    private int upperBound(List<Integer> list, int target) {
        int l = 0, r = list.size();
        while (l < r) {
            int m = (l + r) >>> 1;
            if (list.get(m) <= target)
                l = m + 1;
            else
                r = m;
        }
        return l;
    }
}
