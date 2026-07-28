# Find the Peaks

## Idea

- Only interior indices can be peaks, so scan from index `1` through `length - 2`.
- Add an index to the answer when its value is strictly greater than both neighbors.
- Return the collected indices.

## Why It Works

- The problem defines a peak entirely by its immediate left and right neighbors.
- Checking every eligible interior index covers all possible peaks.
- The first and last positions are skipped because they cannot have two neighbors.

## Edge Cases

- Equal neighboring values are not peaks because the comparison is strict.
- Arrays of length `3` still work because only the middle element is checked.
- If no index satisfies the condition, the answer list remains empty.

## Complexity

- Time: `O(n)`, where `n` is `mountain.length`.
- Space: `O(1)` excluding the returned list.
