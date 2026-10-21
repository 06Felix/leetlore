class Solution {
    public int magicalString(int n) {
        StringBuilder sb = new StringBuilder(" 122");
        for(int i = 3 ; i <= n ; i++){
            if((i & 1) == 1)
                for(int j = sb.charAt(i) - '0' ; j > 0 ; j--)
                    sb.append('1');
            else
                for(int j = sb.charAt(i) - '0' ; j > 0 ; j--)
                    sb.append('2');
        }
        int ans = 0;
        for(int i = 1 ; i <= n ; i++)
            if(sb.charAt(i) == '1')
                ans++;
        return ans;
    }
}
