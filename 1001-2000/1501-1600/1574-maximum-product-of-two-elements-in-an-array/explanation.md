# Explanation

## Idea

- Sort the array in ascending order.
- The two largest values maximize `(nums[i] - 1) * (nums[j] - 1)` because every array value is at least `1`.
- Multiply the last two adjusted values.

## Why It Works

- Subtracting `1` preserves the ordering of the positive values.
- Therefore, the two largest original values also produce the two largest non-negative factors.
- The product of those two factors is the maximum possible product.

## Edge Cases

- The constraints guarantee at least two values.
- Values equal to `1` produce a factor of zero without needing special handling.

## Complexity

- Time: `O(n log n)` due to sorting.
- Space: `O(log n)` auxiliary stack space for the sort, depending on the Java runtime implementation.
