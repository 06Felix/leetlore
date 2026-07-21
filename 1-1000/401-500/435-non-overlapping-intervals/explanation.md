# Non-overlapping Intervals

## Idea

- Sort intervals by end time.
- Keep `currentEnd` as the end of the last interval kept.
- For each next interval, keep it if its start is at least `currentEnd`.
- Otherwise, count it as removed.

## Why It Works

- Keeping the interval with the earliest end leaves the most room for future intervals.
- After sorting by end, when an interval overlaps `currentEnd`, removing the current interval is optimal because the kept one ends no later.
- Non-overlap allows touching endpoints, so `start >= currentEnd` is valid.
- Counting every rejected interval gives the minimum removals.

## Edge Cases

- A single interval removes nothing.
- Intervals sharing an endpoint are kept.
- Fully duplicate intervals keep one and remove the rest.

## Complexity

- Time: $O(n \log n)$ from sorting.
- Space: $O(1)$ extra besides sorting implementation details.
