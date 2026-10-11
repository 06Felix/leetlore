class FWT {
    private int[] arr;
    public FWT(int n) {
        arr = new int[n + 1];
    }
    public void add(int i, int d) {
        while (i < arr.length) {
            arr[i] += d;
            i += lb(i);
        }
    }
    public int get(int i) {
        int sum = 0;
        while (i > 0) {
            sum += arr[i];
            i -= lb(i);
        }
        return sum;
    }
    private static int lb(int i) {
        return i & -i;
    }
}
class Solution {
    public long goodTriplets(int[] nums1, int[] nums2) {
        int n = nums1.length;
        long ans = 0;
        Map<Integer, Integer> n2i = new HashMap<>();
        int[] arr = new int[n];
        int[] lS = new int[n];
        int[] rL = new int[n];
        FWT t1 = new FWT(n);
        FWT t2 = new FWT(n);
        for (int i = 0; i < n; i++)
            n2i.put(nums1[i], i);
        for (int i = 0; i < n; i++)
            arr[i] = n2i.get(nums2[i]);
        for (int i = 0; i < n; i++) {
            lS[i] = t1.get(arr[i]);
            t1.add(arr[i] + 1, 1);
        }
        for (int i = n - 1; i >= 0; i--) {
            rL[i] = t2.get(n) - t2.get(arr[i]);
            t2.add(arr[i] + 1, 1);
        }
        for (int i = 0; i < n; i++)
            ans += (long) lS[i] * rL[i];
        return ans;
    }
}
