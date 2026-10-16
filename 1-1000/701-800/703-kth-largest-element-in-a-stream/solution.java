class KthLargest {
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int num : nums)
            heapify(num);
    }
    public int add(int val) {
        heapify(val);
        return pq.peek();
    }
    private int k;
    private Queue<Integer> pq = new PriorityQueue<>();
    private void heapify(int val) {
        pq.offer(val);
        if (pq.size() > k)
            pq.poll();
    }
}
