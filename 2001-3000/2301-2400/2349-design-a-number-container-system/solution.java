class NumberContainers {
    private Map<Integer, PriorityQueue<Integer>> map;
    private Map<Integer, Integer> arr;
    public NumberContainers() {
        map = new HashMap<>();
        arr = new HashMap<>();
    }
    
    public void change(int index, int number) {
        int prev = arr.getOrDefault(index, 0);
        if(prev != 0){
            if(prev == number)
                return;
            map.get(prev).remove(index);
            if(map.get(prev).size() == 0)
                map.remove(prev);
        }
        arr.put(index, number);
        map.putIfAbsent(number, new PriorityQueue<>());
        map.get(number).offer(index);
    }
    
    public int find(int number) {
        if(!map.containsKey(number))
            return -1;
        return map.get(number).peek();
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */
