class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        int x = 0,l = f.length;
        if(l == 1 && f[0] == 0)
            return true;
        for(int i=0;i<l;i++){
            if(i == 0){
                if(i + 1 < l && f[i] == 0 && f[i+1] == 0){
                    f[i] = 1;
                    x++;
                }
                continue;
            }
            if(i == l-1){
                if(i-1 >=0 && f[i] == 0 && f[i-1] == 0){
                    f[i] = 1;
                    x++;
                }
                continue;
            }
            if(f[i+1] == 0 && f[i-1] == 0 && f[i] == 0){
                f[i] = 1;
                x++;
            }
        }
        return x >= n;
    }
}
