class Solution {
    public boolean closeStrings(String w1, String w2) {
        int l1=w1.length();
        int l2=w2.length();
        if(l1!=l2)
            return false;
        int[]f1=new int[26];
        int[]f2=new int[26];
       for(char i:w1.toCharArray())
            f1[i-'a']++;
        for(char i:w2.toCharArray())
            f2[i-'a']++;

       for(int i=0;i<26;i++)
        if((f1[i]==0&&f2[i]!=0)||(f2[i]==0&&f1[i]!=0))
            return false;
       Arrays.sort(f1);
       Arrays.sort(f2);
       for(int i=0;i<26;i++)
        if(f1[i]!=f2[i])
            return false;
        return true;
    }
}
