class Solution {
    private static final double EPS = 1e-6;

    public boolean judgePoint24(int[] cards) {
        List<Double> l = new ArrayList<>();
        for (int n : cards)
            l.add((double) n);
        return dfs(l);
    }

    private boolean dfs(List<Double> l) {
        if (l.size() == 1)
            return Math.abs(l.get(0) - 24.0) < EPS;
        for (int i = 0; i < l.size(); i++) {
            for (int j = i + 1; j < l.size(); j++) {
                List<Double> next = new ArrayList<>();
                for (int k = 0; k < l.size(); k++)
                    if (k != i && k != j)
                        next.add(l.get(k));
                for (double val : compute(l.get(i), l.get(j))) {
                    next.add(val);
                    if (dfs(next))
                        return true;
                    next.remove(next.size() - 1);
                }
            }
        }
        return false;
    }

    private List<Double> compute(double a, double b) {
        List<Double> res = new ArrayList<>();
        res.add(a + b);
        res.add(a - b);
        res.add(b - a);
        res.add(a * b);
        if (Math.abs(b) > EPS)
            res.add(a / b);
        if (Math.abs(a) > EPS)
            res.add(b / a);
        return res;
    }
}
