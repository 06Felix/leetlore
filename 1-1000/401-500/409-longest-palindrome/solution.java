class Solution 
{
    public int longestPalindrome(String s) 
    {
        int[] arr = new int[128];
        for(char c: s.toCharArray())
            arr[c]++;
        int res = 0;
        for(int i : arr)
            res += i / 2 * 2;
        if(res < s.length())
            res++;
        return res;
    }
}
