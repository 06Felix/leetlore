# Explanation

## Idea

- Put every `(value, index)` pair in a priority queue ordered by value, then index.
- Keep a boolean `marked` array and a running sum of unmarked elements.
- For each query, mark the requested index if needed, then repeatedly pop the smallest unmarked elements.

## Why It Works

- The priority queue always exposes the smallest value, and breaks ties by smaller index as required.
- Already marked entries can remain in the queue; they are skipped when popped.
- Subtracting from `totalUnmarkedSum` exactly once per newly marked index keeps each answer current.

## Edge Cases

- Query index already marked: only the `k` smallest phase changes the state.
- If fewer than `k` unmarked elements remain, the loop marks what exists and stops.
- `long` is used for sums, avoiding overflow across up to `10^5` values.

## Complexity

- Time: $O((n + q + m) \log n)$, with each array element popped at most once across all queries.
- Space: $O(n)$ for the heap and marked array.
