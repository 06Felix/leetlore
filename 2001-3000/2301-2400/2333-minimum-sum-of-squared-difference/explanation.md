# 2333. Minimum Sum of Squared Difference

## Idea

- First reduce the problem to the absolute differences: `abs(nums1[i] - nums2[i])`.
- One operation can reduce any positive difference by `1`.
- Since large values contribute much more after squaring, we should flatten the largest differences first.

## How the Code Works

- `ops = k1 + k2` is the total number of reductions available.
- If the total difference sum is at most `ops`, every difference can become `0`, so the answer is `0`.
- Otherwise, binary search the smallest `cap` such that all differences above `cap` can be lowered to `cap` using at most `ops` operations.
- After capping the large values, use leftover operations to reduce some values equal to `cap` by one more.

## Why It Works

- Lowering a larger difference always helps at least as much as lowering a smaller one, because the square grows faster for bigger numbers.
- The optimal final array of differences is therefore as even as possible among the largest values.
- Binary search finds the level where we can flatten everything above it.
- Any remaining operations can only push a few values from `cap` to `cap - 1`, which is exactly what the final loop does.

## Edge Cases

- If operations are enough to erase all differences, return `0`.
- If there are no useful leftover operations after capping, the final loop does nothing.
- The answer uses `long` because squared values and their sum can exceed `int`.

## Complexity

- Time: `O(n log m)`, where `m` is the maximum initial difference
- Space: `O(n)`

## Tags

- Array
- Binary Search
- Greedy
