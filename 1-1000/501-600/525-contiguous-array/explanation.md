# Explanation

## Idea

- Convert every `0` in the input array to `-1`, so equal counts of `0` and `1` become a subarray sum of `0`.
- Track prefix sums and remember the first index where each prefix sum appeared.
- When the same prefix sum appears again, the subarray between the two positions has balanced zeroes and ones.

## Why It Works

- Replacing `0` with `-1` makes a balanced subarray have total contribution `0`.
- If two prefixes have the same sum, subtracting them gives a zero-sum middle segment.
- Keeping only the earliest index for each prefix maximizes the length when the prefix repeats.

## Edge Cases

- The map starts with prefix sum `0` at index `-1`, allowing balanced prefixes from index `0`.
- Arrays with no balanced segment leave `ans` as `0`.
- The implementation mutates `nums` by changing zeroes to `-1`; that is fine for LeetCode because the input is not reused.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$ for the prefix-sum map.
