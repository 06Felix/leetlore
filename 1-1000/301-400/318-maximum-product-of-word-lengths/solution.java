class Solution {
    private int getMsk(String word){
        int mk = 0;
        for(char ch : word.toCharArray())
            mk |= 1 << ch - 'a';
        return mk;
    }
    public int maxProduct(String[] words) {
        int ans = 0;
        int[] msk = new int[words.length];
        for(int i = 0 ; i < words.length ; i++)
            msk[i] = getMsk(words[i]);
        for(int i = 0 ; i < msk.length ; i++)
            for(int j = i + 1 ; j < msk.length ; j++)
                if((msk[i] & msk[j]) == 0)
                    ans = Math.max(ans, words[i].length() * words[j].length());
        return ans;
    }
}
