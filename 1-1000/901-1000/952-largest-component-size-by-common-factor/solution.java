class DSU {
    int[] parent, size;

    DSU(int n) {
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    int find(int x) {
        if (parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }

    void union(int a, int b) {
        int ra = find(a);
        int rb = find(b);
        if (ra == rb)
            return;
        if (size[ra] < size[rb]) {
            parent[ra] = rb;
            size[rb] += size[ra];
        } else {
            parent[rb] = ra;
            size[ra] += size[rb];
        }
    }

    int getSize(int x) {
        return size[find(x)];
    }
}

class Solution {
    public int largestComponentSize(int[] nums) {
        int n = nums.length;
        DSU dsu = new DSU(n);
        Map<Integer, Integer> factorMap = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            int x = nums[i];
            for (int f = 2; f * f <= x; f++) {
                if (x % f == 0) {
                    if (factorMap.containsKey(f))
                        dsu.union(i, factorMap.get(f));
                    else
                        factorMap.put(f, i);

                    while (x % f == 0)
                        x /= f;
                }
            }
            if (x > 1) {
                if (factorMap.containsKey(x))
                    dsu.union(i, factorMap.get(x));
                else
                    factorMap.put(x, i);
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++)
            ans = Math.max(ans, dsu.getSize(i));
        return ans;
    }
}
