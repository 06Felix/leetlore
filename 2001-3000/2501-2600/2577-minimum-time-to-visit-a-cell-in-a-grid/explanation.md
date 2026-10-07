# Explanation

## Idea
- Reject when neither neighbor of the start can be entered at time one, since standing still is forbidden.
- Explore cells with a min-heap. For a neighbor, choose the earliest arrival no earlier than both `time + 1` and its opening threshold, adjusting the threshold by one when parity requires it.
- Mark a cell when it is enqueued and return the time when the target is popped.

## Why It Works
- Once a move is possible, traversing an available edge back and forth delays arrival by multiples of two without standing still.
- Thus a neighbor's arrival must have the parity of `time + 1`; `extraWait` selects the earliest threshold-compatible time with that parity.
- All paths to a grid cell have fixed checkerboard parity. Its possible predecessors therefore have arrival times of the same parity, and the computed next arrival is nondecreasing in those times. The earliest popped predecessor gives the best possible arrival, justifying marking on insertion here.

## Edge Cases
- If both initial neighbors open after time one, return `-1`; otherwise an edge is available for the two-step delay mechanism.
- Already open cells are entered in one second; thresholds requiring a parity adjustment add one extra second.

## Complexity
- Time: $O(V \log V)$ for $V = RC$ cells, each enqueued at most once.
- Auxiliary space: $O(V)$ for the heap and seen table.

## Notes
- Marking on insertion is justified by this grid's fixed parity and monotonic transition rule; it is not a general rule for weighted shortest-path searches.
