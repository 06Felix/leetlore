class Solution {
    public int minSwaps(String s) {
        int ct = 0;
        for(char ch : s.toCharArray())
            if(ch == '[')
                ct++;
            else if(ct > 0)
                ct--;
        return (ct + 1) / 2;
    }
}
