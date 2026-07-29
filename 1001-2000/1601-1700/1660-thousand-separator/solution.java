class Solution {
    public String thousandSeparator(int n) {
        StringBuilder ans = new StringBuilder();
        String str = String.valueOf(n);
        for(int i = 0 ; i < str.length() ; i++){
            if(i > 0 && (str.length() - i) % 3 == 0)
                ans.append(".");
            ans.append(str.charAt(i));
        }
        return ans.toString();
    }
}
