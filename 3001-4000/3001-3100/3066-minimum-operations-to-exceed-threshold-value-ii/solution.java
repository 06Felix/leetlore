class Solution {
    public int minOperations(int[] nums, int k) {
        Queue<Integer> q = new PriorityQueue<>();
        for(int x : nums)
            if(x < k)
                q.add(x);
        int ans = 0;
        while(!q.isEmpty()){
            int a = q.poll();
            ans++;
            if(q.isEmpty())
                break;
            int b = q.poll();
            long nxt = 2L * a + b;
            if(nxt < k)
                q.offer((int)nxt);
        }
        return ans;
    }
}
