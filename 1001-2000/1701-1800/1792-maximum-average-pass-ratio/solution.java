class Solution {
    private record T(double nr, double dr, double nextRat){};
    private double getRatio(double nr, double dr){
        return (nr + 1) / (dr + 1) - nr / dr;
    }
    public double maxAverageRatio(int[][] classes, int k) {
        int n = classes.length;
        Queue<T> pq = new PriorityQueue<>((a, b) -> Double.compare(b.nextRat, a.nextRat));
        for(int[] cl : classes)
            pq.offer(new T(cl[0], cl[1], getRatio(cl[0], cl[1])));
        while(k-- > 0){
            T cur = pq.poll();
            pq.offer(new T(cur.nr + 1, cur.dr + 1, getRatio(cur.nr + 1, cur.dr + 1)));
        }
        double ans = 0;
        while(!pq.isEmpty()){
            T cur = pq.poll();
            ans += cur.nr / cur.dr;
        }
        return ans / n;
    }
}
