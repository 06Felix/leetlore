class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] mc = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> ans = new HashSet<>();
        for(String str : words){
            StringBuilder sb = new StringBuilder();
            for(char ch : str.toCharArray())
                sb.append(mc[ch - 'a']);
            ans.add(sb.toString());
        }
        return ans.size();
    }
}
