# Data Stream as Disjoint Intervals

## Idea

- Store intervals in a TreeMap keyed by start. For a new value, find neighboring starts and either bridge two intervals, extend the lower interval, extend the upper interval to the left, or create a singleton. Return map values in key order.

## Why It Works

- Only the immediate predecessor and successor intervals can contain or touch the inserted value. Handling their adjacency cases preserves exactly the seen values while keeping intervals disjoint and maximally merged. TreeMap order supplies ascending starts.

## Edge Cases

- An existing start returns immediately; a duplicate inside an interval leaves its endpoint unchanged. A value between adjacent intervals can merge both at once.

## Complexity

- O(log(M + 1)) per add and O(M) per getIntervals for M current intervals. Internal storage is O(M), plus the O(M) returned outer array.

## Notes

- getIntervals creates a new outer array but returns the internal int[] interval references. A caller modifying those inner arrays can corrupt stored intervals; the code does not return defensive copies. Value bounds keep adjacency arithmetic safe.
