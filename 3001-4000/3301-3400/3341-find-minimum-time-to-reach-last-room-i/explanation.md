# Find Minimum Time to Reach Last Room I

## Idea
- Run Dijkstra's algorithm from the top-left room using a min-heap of arrival times.
- Moving to a neighbor arrives at `max(currentTime, neighborOpeningTime) + 1`, allowing waiting before the move begins.

## Why It Works
- Each transition gives the earliest possible arrival after respecting the neighbor's opening time and the one-second movement duration.
- The transition is nondecreasing in the current arrival time, so reaching a room earlier can never hurt a later move. Dijkstra's minimum-time extraction is valid.
- The first destination entry removed from the heap has the globally minimum arrival time.

## Edge Cases
- Waiting is allowed at the starting room, and the starting room is available at time zero regardless of its input value.
- The code can process stale heap entries, but only strictly improved times are enqueued; stale entries cannot improve on an earlier expansion.

## Complexity
- Time: $O(nm\log(nm))$ for a grid with constant-degree adjacency, including heap operations and possible stale expansions.
- Space: $O(nm)$ for arrival times and heap entries.

## Notes
- The implementation changes `moveTime[0][0]` to `-1` in place.
- Arrival times fit `int`: opening times are at most $10^9$, and a simple grid route adds only a bounded number of seconds.
