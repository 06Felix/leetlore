class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
        int[] req = new int[26];
        for(String reqs : words2) {
            int[] arr = count(reqs);
            for(int i = 0 ; i < 26 ; i++)
                req[i] = Math.max(req[i], arr[i]);
        }
        for(String word : words1)
            if(valid(count(word), req))
                ans.add(word);
        return ans;
    }
    public int[] count(String str) {
        int[] ct = new int[26];
        for(char ch : str.toCharArray())
            ct[ch - 'a']++;
        return ct;
    }
    public boolean valid(int[] p, int[] q){
        for(int i = 0 ; i < 26 ; i++)
            if(p[i] < q[i])
                return false;
        return true;
    }
}
