class Solution {
    public int maxSelectedElements(int[] a) {
        int n = a.length;
        Arrays.sort(a);
    
        int[] f = new int[a[n -1] + 2];
        f[a[0]] = 1;
        f[a[0] + 1] = 1;
        int rs = 1;
        for (int i = 1; i < n; i++) {
            f[a[i] + 1] = Math.max(f[a[i] + 1], f[a[i]] + 1);
            f[a[i]] = Math.max(f[a[i]], f[a[i] - 1] + 1);
            rs = Math.max(rs, Math.max(f[a[i]], f[a[i] + 1]));
        }
        return rs;
        
    }
}
