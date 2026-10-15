class BIT {
    int[] arr;
    int n;
    public BIT(int sz) {
        n = sz + 2;
        arr = new int[n];
    }
    void update(int i, int val) {
        i++;
        while(i < n) {
            arr[i] += val;
            i += i & -i;
        }
    }
    int query(int i) {
        i++;
        int ans = 0;
        while (i > 0) {
            ans += arr[i];
            i -= i & -i;
        }
        return ans;
    }
    int sum(int l, int r) {
        return query(r) - query(l - 1);
    }
}
class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int mx = 0;
        for(int num : nums)
            mx = Math.max(mx, num);
        BIT arr = new BIT(n);
        for(int i = 0; i < n; i++)
            if (nums[i] == 0)
                arr.update(i, 1);
        List<List<Integer>> l = new ArrayList<>();
        for(int i = 0; i <= mx; i++)
            l.add(new ArrayList<>());
        for(int i = 0; i < n; ++i)
            if (nums[i] != 0)
                l.get(nums[i]).add(i);
        int ans = 0;
        for(int i = 1; i <= mx; i++) {
            if (l.get(i).isEmpty())
                continue;
            int pt = 0;
            int prv = -1;
            for(int p : l.get(i))
                if(prv == -1 || arr.sum(prv + 1, p - 1) > 0) {
                    pt++;
                    prv = p;
                }
            for(int p : l.get(i))
                arr.update(p, 1);
            ans += pt;
        }
        return ans;
    }
}
