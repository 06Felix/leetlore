class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        int[] arr = new int[n + 1];
        for(int[] sh : shifts){
            int st = sh[0];
            int end = sh[1];
            int dir = sh[2] == 1 ? 1 : -1;
            arr[st] += dir;
            arr[end + 1] -= dir;
        }
        int cur = 0;
        for(int i = 0 ; i < n ; i++){
            cur = (cur + arr[i]) % 26;
            int ch = (s.charAt(i) - 'a' + cur + 26) % 26;
            ans.append((char)(ch + 'a'));
        }
        return ans.toString();
    }
}
