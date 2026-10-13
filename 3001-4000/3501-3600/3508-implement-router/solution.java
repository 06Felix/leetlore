class Router {
    private static class Packet {
        int source, destination, timestamp;
        Packet(int s, int d, int t) { 
            source = s;
            destination = d;
            timestamp = t;
        }
    }
    private int memoryLimit;
    private Deque<Packet> queue;
    private Set<Long> packetSet;
    private Map<Integer, ArrayList<Integer>> destMap;
    private Map<Integer, Integer> destStart;

    public Router(int memoryLimit) {
        this.memoryLimit = memoryLimit;
        this.queue = new ArrayDeque<>();
        this.packetSet = new HashSet<>();
        this.destMap = new HashMap<>();
        this.destStart = new HashMap<>();
    }

    private long makeKey(int s, int d, int t) {
        return (((long)s) << 42) ^ (((long)d) << 21) ^ (long)t;
    }

    public boolean addPacket(int source, int destination, int timestamp) {
        long key = makeKey(source, destination, timestamp);
        if (packetSet.contains(key))
            return false;

        if (queue.size() == memoryLimit)
            forwardPacket();

        Packet p = new Packet(source, destination, timestamp);
        queue.addLast(p);
        packetSet.add(key);
        destMap.putIfAbsent(destination, new ArrayList<>());
        destStart.putIfAbsent(destination, 0);
        destMap.get(destination).add(timestamp);
        return true;
    }

    public int[] forwardPacket() {
        if (queue.isEmpty()) 
            return new int[0];

        Packet p = queue.removeFirst();
        long key = makeKey(p.source, p.destination, p.timestamp);
        packetSet.remove(key);

        int idx = destStart.get(p.destination);
        destStart.put(p.destination, idx + 1);

        return new int[]{p.source, p.destination, p.timestamp};
    }

    public int getCount(int destination, int startTime, int endTime) {
        if (!destMap.containsKey(destination))
            return 0;
        ArrayList<Integer> arr = destMap.get(destination);
        int startIdx = destStart.get(destination);
        int lo = lowerBound(arr, startIdx, arr.size(), startTime);
        int hi = upperBound(arr, startIdx, arr.size(), endTime);
        return Math.max(0, hi - lo);
    }

    private int lowerBound(ArrayList<Integer> arr, int l, int r, int target) {
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) >= target)
                r = mid;
            else l = mid + 1;
        }
        return l;
    }

    private int upperBound(ArrayList<Integer> arr, int l, int r, int target) {
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) > target)
                r = mid;
            else l = mid + 1;
        }
        return l;
    }
}
