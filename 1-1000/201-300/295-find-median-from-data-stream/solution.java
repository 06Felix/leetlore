class MedianFinder {
    private Queue<Integer> lH = new PriorityQueue<>((a, b) -> b - a);
    private Queue<Integer> rH = new PriorityQueue<>();
    
    public void addNum(int num) {
        if(lH.isEmpty() || lH.peek() >= num)
            lH.offer(num);
        else
            rH.offer(num);
        if(rH.size() > lH.size())
            lH.offer(rH.poll());
        else if(lH.size() - rH.size() > 1)
            rH.offer(lH.poll());
    }
    
    public double findMedian() {
        if(lH.size() == rH.size())
            return (lH.peek() + rH.peek()) / 2.0;
        return lH.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
