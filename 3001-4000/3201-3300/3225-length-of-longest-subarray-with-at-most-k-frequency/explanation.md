# Explanation

## Idea

- Use a sliding window with a frequency map.
- Expand the right end one value at a time.
- If the newly added value exceeds frequency `k`, move the left end until it is valid again.

## Why It Works

- The only possible violation after adding `nums[r]` is for that value's frequency.
- Shrinking from the left removes elements until `nums[r]` appears at most `k` times.
- After restoration, every value in the window has frequency at most `k`, so the window length is a candidate answer.

## Edge Cases

- `k = 1` keeps only windows with distinct values.
- Arrays with one repeated value shrink to length at most `k`.
- Large values are handled by the map instead of direct indexing.

## Complexity

- Time: $O(n)$ average.
- Space: $O(d)$ for distinct values in the window.
