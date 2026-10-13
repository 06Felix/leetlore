class UF {
    int[] pt;
    public UF(int n) {
        pt = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            pt[i] = i;
        }
    }
    public int find(int i) {
        return pt[i] = (i == pt[i] ? i : find(pt[i]));
    }
    public void union(int i) {
        pt[i] = find(i + 1);
    }
}

class Solution {
    public int[] avoidFlood(int[] rain) {
        int n = rain.length;
        UF uf = new UF(n + 1);
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[n];
        Arrays.fill(ans, 1);
        for (int i = 0; i < n; i++) {
            int cur = rain[i];
            if (cur == 0)
                continue;
            ans[i] = -1;
            uf.union(i);
            if (map.containsKey(cur)) {
                int prv = map.get(cur);
                int dry = uf.find(prv + 1);
                if (dry >= i)
                    return new int[0];
                ans[dry] = cur;
                uf.union(dry);
                map.put(cur, i);
            }
            else
                map.put(cur, i);
        }
        return ans;
    }
}
