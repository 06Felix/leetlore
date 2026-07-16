# GCD Sum

## Idea

- Track the running maximum while constructing `pref`.
- For each index, store `gcd(nums[i], running maximum)`.
- Sort `pref`, then pair `pref[i]` with `pref[n - 1 - i]` for every `i < n / 2`.
- Add the gcd of each pair to a `long` result.

## Why It Works

- The running maximum at index `i` is exactly the required `mxi`.
- Sorting places the smallest and largest currently unpaired values at the paired indices.
- The loop processes exactly `floor(n / 2)` pairs, so an odd middle element is ignored.

## Edge Cases

- For `n = 1`, no pair is formed and the result is `0`.
- Duplicate values are handled naturally by sorting.
- The result uses `long` because the sum can exceed the `int` range.

## Complexity

- Time: $O(n \log n)$.
- Space: $O(n)$.
