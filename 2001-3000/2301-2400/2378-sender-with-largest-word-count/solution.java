class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        Map<String, Integer> m = new HashMap<>();
        int n = messages.length;
        String ans = "";
        int mx = 0;
        for(int i = 0 ; i < n ; i++)
            m.merge(senders[i], messages[i].split(" ").length, Integer::sum);
        for(String str : m.keySet()){
            if(m.get(str) > mx){
                mx = m.get(str);
                ans = str;
            }
            else if(m.get(str) == mx && str.compareTo(ans) > 0)
                ans = str;
        }
        return ans;
    }
}
