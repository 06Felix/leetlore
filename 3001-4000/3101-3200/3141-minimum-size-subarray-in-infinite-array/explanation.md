# Explanation

## Idea

Split the target into full copies of `nums` plus a remainder. The full copies contribute `count * nums.length` to the answer length.

Then use a sliding window over two copies of `nums` to find the shortest subarray whose sum is the remainder.

## Why It Works

All numbers are positive, so a standard sliding window can find shortest subarrays for a fixed sum.

Any useful remainder window in the infinite array can be represented inside two consecutive copies of `nums`. Full array copies before it only add the fixed full-cycle length.

If no window reaches the remainder, no finite subarray can sum to the target.

## Edge Cases

- When `target` is a multiple of the array sum, the remainder is `0`, so the best extra window has length `0`.
- Positive numbers allow shrinking while the window sum is too large.
- The implementation scans `2 * n - 1` positions, enough for wrapped windows shorter than two full arrays.

## Complexity

Time: `O(n)`.

Space: `O(1)`.
