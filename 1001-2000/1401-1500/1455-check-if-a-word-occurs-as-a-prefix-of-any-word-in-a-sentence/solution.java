class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr = sentence.split(" ");
        int wc = 0;
        for(String word : arr){
            wc++;
            if(word.indexOf(searchWord) == 0)
                return wc;
        }
        return -1;
    }
}
