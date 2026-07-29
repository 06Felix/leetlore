# Count of Range Sum

## Idea

- Build prefix sums so each range sum is `prefix[j] - prefix[i]`.
- Use merge sort on the prefix array.
- While merging two sorted halves, count for each left prefix how many right prefixes have differences within `[low, up]`.

## Why It Works

- Every valid subarray sum corresponds to a pair of prefix sums with the later prefix on the right side of a merge split.
- Because the right half is sorted, two pointers find the first prefix with difference at least `low` and the first prefix with difference greater than `up`.
- The number of valid right prefixes for a left prefix is `r1 - l1`.
- Sorting after counting lets higher merge levels count cross-range pairs correctly.

## Edge Cases

- Prefix sums use `long` to avoid overflow from integer accumulation.
- Negative numbers are handled naturally by prefix differences.
- The answer is stored in `int`, matching the problem guarantee that it fits in 32 bits.

## Complexity

- Time: `O(n log n)`.
- Space: `O(n)` for merge buffers and prefix sums.
