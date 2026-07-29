class MyCalendar {
    TreeMap<Integer, Integer> m = new TreeMap<>();
    public boolean book(int start, int end) {
        Integer lw = m.lowerKey(end);
        if(lw == null || m.get(lw) <= start){
            m.put(start, end);
            return true;
        }
        return false;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
