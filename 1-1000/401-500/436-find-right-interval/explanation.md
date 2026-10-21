# Find Right Interval

## Idea
- Store each unique interval start and its original index in a `TreeMap`.
- For each interval end, use `ceilingEntry` to find the smallest start greater than or equal to it; return that index or `-1`.

## Why It Works
- The map orders starts, and its ceiling lookup returns precisely the minimum start satisfying the right-interval condition.
- Stored original indices keep answers aligned with the input order without sorting or changing the intervals.

## Edge Cases
- An exact start/end match is eligible, including an interval pointing to itself when its start equals its end.
- If no start is large enough, the ceiling entry is `null` and the answer is `-1`.

## Complexity
- $O(n\log n)$ time for insertion and lookup.
- $O(n)$ auxiliary space, plus the answer array.
