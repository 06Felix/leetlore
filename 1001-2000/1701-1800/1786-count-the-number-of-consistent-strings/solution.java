class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] arr = new boolean[26];
        for (char ch : allowed.toCharArray())
            arr[ch - 'a'] = true;
        int ans = 0;
        for (String word : words) {
            boolean fnd = true;
            for (char ch : word.toCharArray())
                if(!arr[ch - 'a']){
                    fnd = false;
                    break;
                }
            if(fnd)
                ans++;
        }
        return ans;
    }
}
