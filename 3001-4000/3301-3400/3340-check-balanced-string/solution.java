class Solution {
    public boolean isBalanced(String num) {
        int o = 0;
        int e = 0;
        char[] arr = num.toCharArray();
        int n = arr.length;
        for(int i = 0 ; i < n ; i++)
            if(i % 2 == 0)
                e += (int)(arr[i] - '0');
            else
                o += (int)(arr[i] - '0');
        return o == e;
    }
}
