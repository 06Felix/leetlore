# Explanation

## Idea

- Count subarrays with exactly `k` distinct values as `atMost(k) - atMost(k - 1)`.
- The helper uses a sliding window and a frequency array.
- For each right endpoint, add the number of valid starts for subarrays ending there.

## Why It Works

- Every subarray with exactly `k` distinct values is counted in `atMost(k)` but not in `atMost(k - 1)`.
- The helper decreases `k` when a new distinct value enters the window.
- When the window has too many distinct values, moving `l` restores the limit.
- Once valid, all starts from `l` through `r` produce valid subarrays ending at `r`.

## Edge Cases

- `k = 1` works through `atMost(1) - atMost(0)`.
- Repeated values extend the window without changing distinct count.
- Values are bounded by `nums.length`, so the frequency array is safe.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$ for the frequency array.
