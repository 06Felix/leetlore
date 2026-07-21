class Solution {
    public String smallestSubsequence(String s) {
        StringBuilder sb = new StringBuilder();
        int[] ct = new int[128];
        boolean[] vis = new boolean[128];
        for(char ch : s.toCharArray())
            ct[ch]++;
        for(char ch : s.toCharArray()){
            ct[ch]--;
            if(vis[ch])
                continue;
            while(sb.length() > 0 && sb.charAt(sb.length() - 1) > ch && ct[sb.charAt(sb.length() - 1)] > 0){
                vis[sb.charAt(sb.length() - 1)] = false;
                sb.setLength(sb.length() - 1);
            }
            vis[ch] = true;
            sb.append(ch);
        }
        return sb.toString();
    }
}
