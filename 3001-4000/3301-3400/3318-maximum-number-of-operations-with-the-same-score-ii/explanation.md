# Maximum Number of Operations With the Same Score II

## Idea

- The recursive state is the current remaining interval `[start, end]`.
- `lastSum` is the required score; `0` is used only at the beginning to allow any first operation.
- At each state, the code tries deleting the first two, last two, or first and last values when their sum matches the required score.
- `memo[start][end]` stores the best result for that interval.

## Why It Works

- Every operation removes two elements from the interval ends, so the remaining problem is another interval.
- After the first operation fixes the score, every later operation must match that same score.
- Trying all valid endpoint-removal choices covers all legal continuations.
- Memoization avoids recomputing intervals reached through different operation orders.

## Edge Cases

- Fewer than two remaining elements returns `0`.
- The first operation can be any of the three choices because `lastSum == 0`.
- All values are positive, so using `0` as the initial sentinel cannot conflict with a real operation score.

## Complexity

- Time: $O(n^2)$ states with constant work per state.
- Space: $O(n^2)$ for memoization plus recursion stack.

## Notes

- The memo key omits `lastSum`; this works for paths after a fixed first score only if each interval is not reached with conflicting target sums. A more explicit implementation would memoize per chosen target score.
