class Solution {
    public String compressedString(String word) {
        char[] arr = word.toCharArray();
        int cur = 0, i = 0, n = arr.length;
        StringBuilder sb = new StringBuilder();
        while(i < n){
            int t = 0, j = i;
            while(j < n && arr[i] == arr[j] && t < 9){
                j++;
                t++;
            }
            sb.append(t);
            sb.append(arr[i]);
            i = j;
        }
        return sb.toString();
    }
}
