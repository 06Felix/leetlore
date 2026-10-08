# Explanation

## Idea
- Count existing occurrences of `k`.
- For each candidate original value from one through 50, scan with gains of one for that value, losses of one for existing `k`, and zero otherwise.
- Use a reset-to-zero maximum-subarray scan to find the best net gain and add it to the original count.

## Why It Works
- Adding `k - candidate` to a selected subarray converts its candidate values to `k` and, for a nonzero shift, removes its original `k` values.
- Other values contribute no change in frequency. Maximizing this gain over contiguous subarrays and all possible candidates covers every useful shift.

## Edge Cases
- A zero shift always preserves the original frequency, represented by gain zero.
- The candidate equal to `k` yields no positive gain in the helper and cannot improve the baseline.

## Complexity
- Time: $O(50n)$, linear under the fixed value bound.
- Auxiliary space: $O(1)$, including the fixed-size unused count array.
