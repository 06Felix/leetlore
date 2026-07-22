class Solution {
    public int countSeniors(String[] details) {
        int ans = 0;
        for(String st : details)
            if(Integer.parseInt(st.substring(11, 13)) > 60)
                ans++;
        return ans;
    }
}
