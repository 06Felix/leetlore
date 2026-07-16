// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> it;
    private Integer val;
	public PeekingIterator(Iterator<Integer> iterator) {
	    it = iterator;
        val = it.hasNext() ? it.next() : null;	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return val;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer nxt = val;
        val = it.hasNext() ? it.next() : null;
        return nxt;
	}
	
	@Override
	public boolean hasNext() {
	    return val != null;
	}
}
