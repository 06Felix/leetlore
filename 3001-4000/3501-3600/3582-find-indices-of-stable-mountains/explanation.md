# Find Indices of Stable Mountains

## Idea

- Mountain `0` cannot be stable, so start scanning at index `1`.
- For each index `i`, check whether the previous height `height[i - 1]` is strictly greater than `threshold`.
- Add `i` to the answer when that condition holds.

## Why It Works

- Stability depends only on the immediately previous mountain.
- The implementation checks exactly that previous mountain for every eligible index.
- The comparison is strict, matching the problem's "greater than threshold" rule.

## Edge Cases

- Index `0` is never considered.
- If the previous height equals `threshold`, the current index is not stable.
- If no previous height exceeds the threshold, the returned list is empty.

## Complexity

- Time: `O(n)`, where `n` is `height.length`.
- Space: `O(1)` excluding the returned list.
