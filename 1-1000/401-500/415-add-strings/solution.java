class Solution {
    public String addStrings(String num1, String num2) {
        char[] a = num1.toCharArray();
        char[] b = num2.toCharArray();
        int i = a.length - 1, j = b.length - 1;
        int cry = 0;
        StringBuilder ans = new StringBuilder();
        while(i>=0 || j >=0 || cry > 0){
            if(i >= 0)
                cry += a[i--] - 48;
            if(j >= 0)
                cry += b[j--] - 48;
            ans.append(cry%10);
            cry /= 10;
        }
        return ans.reverse().toString();
    }
}
