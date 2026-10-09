class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();
        int len = 0;
        for(char ch : s.toCharArray()){
            if(ch >= '0' && ch <= '9'){
                sb.deleteCharAt(len - 1);
                len--;
            }
            else{
                sb.append(ch);
                len++;
            }
        }
        return sb.toString();
    }
}
