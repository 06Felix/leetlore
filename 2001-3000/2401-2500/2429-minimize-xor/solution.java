class Solution {
    public int minimizeXor(int num1, int num2) {
        int x = Integer.bitCount(num1);
        int y = Integer.bitCount(num2);
        if(y == x)
            return num1;
        int ans = 0;
        for(int i = 29 ; i >= 0 ; i--){
            if((num1 & (1 << i)) > 0){
                ans |= (1 << i);
                if(--y == 0)
                    return ans;
            }
        }
        for(int i = 0 ; i < 30 ; i++){
            if((num1 & (1 << i)) == 0){
                ans |= (1 << i);
                if(--y == 0)
                    return ans;
            }
        }
        return ans;
    }
}
