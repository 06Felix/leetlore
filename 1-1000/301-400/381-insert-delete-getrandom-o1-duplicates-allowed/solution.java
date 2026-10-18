class RandomizedCollection {
    private Map<Integer, List<Integer>> m = new HashMap<>();
    private List<Item> items = new ArrayList<>();
    private Random rand = new Random();
    public boolean insert(int val) {
        m.putIfAbsent(val, new ArrayList<>());
        m.get(val).add(items.size());
        items.add(new Item(val, m.get(val).size() - 1));
        return m.get(val).size() == 1;
    }

    public boolean remove(int val) {
        if (!m.containsKey(val))
            return false;

        int i = lasti(m.get(val));
        Item lastItem = last(items);
        m.get(lastItem.val).set(lastItem.iInMap, i);
        int iSz = m.get(val).size();
        m.get(val).remove(iSz - 1);
        if (m.get(val).isEmpty())
            m.remove(val);
        items.set(i, lastItem);
        items.remove(items.size() - 1);
        return true;
    }

    public int getRandom() {
        int i = rand.nextInt(items.size());
        return items.get(i).val;
    }

    private record Item(int val, int iInMap) {}


    private int lasti(List<Integer> indices) {
        return indices.get(indices.size() - 1);
    }

    private Item last(List<Item> items) {
        return items.get(items.size() - 1);
    }
}
