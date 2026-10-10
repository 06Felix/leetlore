class Solution {
    public List<Integer> partitionLabels(String str) {
        int l = 0;
        int r = 0;
        char[] s = str.toCharArray();
        int n = s.length;
        int[] right = new int[26];
        for(int i = 0 ; i < n ; i++)
            right[s[i] - 'a'] = i;
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            r = Math.max(r, right[s[i] - 'a']);
            if(r == i){
                ans.add(r - l + 1);
                l = i + 1;
            }
        }
        return ans;
    }
}
