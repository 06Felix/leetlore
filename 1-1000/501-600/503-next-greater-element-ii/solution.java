class Solution {
    public int[] nextGreaterElements(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];
        for(int i = 2 * n - 1 ; i >= 0 ; i--){
            while(!s.isEmpty() && s.peek() <= arr[i % n])
                s.pop();
            if(i < n){
                if(!s.isEmpty())
                    ans[i] = s.peek();
                else
                    ans[i] = -1;
            }
            s.push(arr[i % n]);
        }
        return ans;
    }
}
