# Explanation

## Idea

The solution keeps a map from ending value to the best subsequence length ending with that value.

For each number `x`, the previous value in a valid subsequence must be `x - difference`, so the best length ending at `x` is one more than the best length ending there.

## Why It Works

The fixed difference makes each transition deterministic by value. When processing left to right, the map already contains the best valid subsequence lengths from earlier positions.

Updating `x` from `x - difference` extends the best possible earlier subsequence, and taking the maximum answer over all updates gives the longest valid subsequence.

## Edge Cases

- If no previous value exists, the map returns `0`, so the current number starts a length-`1` subsequence.
- Duplicate values are handled by overwriting the map with the best length seen so far for that value.
- Negative numbers and negative differences work normally as map keys.

## Complexity

Time: `O(n)`.

Space: `O(n)`.
