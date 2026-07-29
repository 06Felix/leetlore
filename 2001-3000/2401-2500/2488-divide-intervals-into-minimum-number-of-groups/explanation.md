# Explanation

## Idea

- Use a difference array over the coordinate range.
- For each inclusive interval `[l, r]`, add `+1` at `l` and `-1` at `r + 1`.
- Prefix-scan the difference array to count active intervals at each point.
- The maximum active count is the answer.

## Why It Works

- Intervals that overlap at the same point must all be in different groups.
- Therefore the answer is at least the maximum number of simultaneously active intervals.
- A sweep-line assignment can always reuse a group when an interval no longer overlaps, so that maximum overlap is also sufficient.
- The difference array computes exactly that maximum overlap for inclusive integer intervals.

## Edge Cases

- Touching intervals like `[1, 5]` and `[5, 8]` both count at point `5`, so they overlap.
- The decrement at `r + 1` preserves inclusive endpoints.
- The array length includes `1000001` plus one extra slot for `r + 1`.

## Complexity

- Time: `O(n + C)`, where `C = 10^6`.
- Space: `O(C)`.
