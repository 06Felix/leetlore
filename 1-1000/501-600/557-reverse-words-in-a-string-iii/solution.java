class Solution {
    public String reverseWords(String s) {
        
        char[] str = s.toCharArray();
        int start = 0;
        int len = s.length();
        for(int i=0;i<len;i++)
        {
            if(str[i] == ' ')
            {
                reverse(str,start,i-1);
                start = i+1;
            }
        }
        reverse(str,start,len-1);
        return new String(str);
    }
    public void reverse(char[] str,int i,int j)
    {
        while(i<j)
        {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }
}
