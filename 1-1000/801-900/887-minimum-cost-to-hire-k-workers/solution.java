class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        double[][] workers = new double[quality.length][2];
        double ans = Double.MAX_VALUE;
        for (int i = 0; i < workers.length; i++) {
            workers[i][0] = (double) wage[i] / quality[i];
            workers[i][1] = (double) quality[i];
        }
        Arrays.sort(workers, (a, b) -> Double.compare(a[0], b[0]));
        PriorityQueue<Double> pq = new PriorityQueue<>((a, b) -> (int) (b - a));
        int sum = 0;
        for (double[] worker : workers) {
            sum += worker[1];
            pq.add(worker[1]);
            if (pq.size() > k) {
                sum -= pq.poll();
            }
            if (pq.size() == k) {
                ans = Math.min(ans, sum * worker[0]);
            }
        }
        return ans;
    }
}
