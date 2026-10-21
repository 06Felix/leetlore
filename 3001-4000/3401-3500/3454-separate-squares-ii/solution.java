class Event {
    double y;
    int x1, x2;
    int type;

    Event(double y, int x1, int x2, int type) {
        this.y = y;
        this.x1 = x1;
        this.x2 = x2;
        this.type = type;
    }
}

class Solution {
    public double separateSquares(int[][] squares) {
        int n = squares.length;
        List<Event> events = new ArrayList<>();
        for (int[] s : squares) {
            int x1 = s[0];
            int y1 = s[1];
            int len = s[2];
            int x2 = x1 + len;
            int y2 = y1 + len;
            events.add(new Event(y1, x1, x2, +1));
            events.add(new Event(y2, x1, x2, -1));
        }
        events.sort(Comparator.comparingDouble(e -> e.y));
        TreeMap<Integer, Integer> active = new TreeMap<>();
        double prevY = events.get(0).y;
        double totalArea = 0;
        List<double[]> slabs = new ArrayList<>();
        for (Event e : events) {
            double curY = e.y;
            double height = curY - prevY;
            if (height > 0) {
                double unionX = computeUnionX(active);
                if (unionX > 0) {
                    slabs.add(new double[] { prevY, curY, unionX });
                    totalArea += unionX * height;
                }
            }
            if (e.type == 1) {
                active.merge(e.x1, 1, Integer::sum);
                active.merge(e.x2, -1, Integer::sum);
            } else {
                active.merge(e.x1, -1, Integer::sum);
                if (active.get(e.x1) == 0)
                    active.remove(e.x1);
                active.merge(e.x2, 1, Integer::sum);
                if (active.get(e.x2) == 0)
                    active.remove(e.x2);
            }
            prevY = curY;
        }

        double half = totalArea / 2.0;
        double acc = 0;
        for (double[] slab : slabs) {
            double y1 = slab[0];
            double y2 = slab[1];
            double unionX = slab[2];
            double slabArea = unionX * (y2 - y1);
            if (acc + slabArea >= half) {
                double remaining = half - acc;
                return y1 + remaining / unionX;
            }
            acc += slabArea;
        }
        return 11.93;
    }

    private double computeUnionX(TreeMap<Integer, Integer> map) {
        int sum = 0;
        Integer prev = null;
        double length = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int x = e.getKey();
            if (sum > 0 && prev != null)
                length += x - prev;
            sum += e.getValue();
            prev = x;
        }
        return length;
    }
}
