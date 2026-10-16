class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> l = new ArrayList<>();
        l.add(0);
        for (int i = 0; i < n; i++)
            for (int j = l.size() - 1; j >= 0; j--)
                l.add(l.get(j) | 1 << i);
        return l;
    }
}
