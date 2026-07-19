class Solution {
    public String interpret(String command) {
        StringBuilder ans = new StringBuilder();
        char[] arr = command.toCharArray();
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == 'G')
                ans.append("G");
            else if(arr[i] == '('){
                if(arr[i + 1] == ')')
                    ans.append("o");
                else
                    ans.append("al");
            }
        }
        return ans.toString();
    }
}
