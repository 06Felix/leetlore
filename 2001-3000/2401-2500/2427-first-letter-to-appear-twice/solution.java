class Solution {
    public char repeatedCharacter(String s) {
        int[] arr = new int[26];
        for(char ch : s.toCharArray()){
            if(arr[ch - 'a'] == 1)
                return ch;
            arr[ch - 'a']++;
        }
        return ' ';
    }
}
