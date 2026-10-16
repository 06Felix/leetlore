class SummaryRanges {
    TreeMap<Integer, int[]> m = new TreeMap<>();

    public void addNum(int val) {
        if (m.containsKey(val))
            return;
        Integer lo = m.lowerKey(val);
        Integer hi = m.higherKey(val);
        if (lo != null && hi != null && m.get(lo)[1] + 1 == val && val + 1 == hi) {
            m.get(lo)[1] = m.get(hi)[1];
            m.remove(hi);
        } else if (lo != null && m.get(lo)[1] + 1 >= val)
            m.get(lo)[1] = Math.max(m.get(lo)[1], val);
        else if (hi != null && val + 1 == hi) {
            m.put(val, new int[] { val, m.get(hi)[1] });
            m.remove(hi);
        } else
            m.put(val, new int[] { val, val });
    }

    public int[][] getIntervals() {
        return m.values().stream().toArray(int[][]::new);
    }
}
