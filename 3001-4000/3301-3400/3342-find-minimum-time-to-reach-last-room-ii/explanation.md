# Find Minimum Time to Reach Last Room II

## Idea
- Run Dijkstra's algorithm with heap entries carrying arrival time and the next move duration, initially one second.
- A neighbor's arrival is `max(currentTime, neighborOpeningTime) + nextDuration`; XOR with three toggles durations between one and two.

## Why It Works
- Every grid move changes checkerboard color, so all paths to a given cell have the same move-count parity. The next duration is therefore determined by the cell, making one best-time entry per cell sufficient.
- With that fixed duration, arrival transitions are nondecreasing in time; waiting from an earlier arrival can reproduce any later departure.
- Dijkstra consequently finalizes the minimum destination time when that cell is first removed from the heap.

## Edge Cases
- Waiting does not toggle movement duration; only actual moves do.
- Different path lengths reaching the same cell differ by an even number of moves and share the same duration state. Stale heap entries are processed but cannot improve on earlier expansions.

## Complexity
- Time: $O(nm\log(nm))$ for the grid and heap operations.
- Space: $O(nm)$ for arrival times and heap entries.

## Notes
- The starting room's input value is overwritten with `-1`.
- Under the stated grid and opening-time bounds, arrival times and comparator differences fit `int`.
