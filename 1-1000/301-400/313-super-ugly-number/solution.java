class UN{
    public int p, i, val;
    public UN(int a, int b, int c){
        p = a;
        i = b;
        val = c;
    }
}
class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        Queue<UN> hp = new PriorityQueue<>((a, b) -> a.val - b.val);
        int[] nums = new int[n];
        nums[0] = 1;
        for(int p : primes)
            hp.offer(new UN(p, 1, p));
        for(int i = 1 ; i < n ; i++){
            nums[i] = hp.peek().val;
            while(hp.peek().val == nums[i]){
                UN u = hp.poll();
                hp.offer(new UN(u.p, u.i + 1, u.p * nums[u.i]));
            }
        }
        return nums[n - 1];
    }
}
