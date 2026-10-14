# Maximum Frequency of an Element After Performing Operations I

## Idea

- Build prefix counts over values, then enumerate each nonnegative target. Count existing equal values and values within distance k; add at most numOps reachable unequal values.

## Why It Works

- Equal elements cost no change. Each other element within [target - k, target + k] needs one distinct operation, giving freq + min(numOps, reachable - freq). Enumerating targets finds the maximum.

## Edge Cases

- Zero operations preserve the largest original frequency. Extra required operations can add zero, so the operation count need not reduce the optimum. Negative targets cannot improve coverage over zero because all input values are positive.

## Complexity

- O(n + U) time and O(U) space, where U = max(nums) + k + 2.

## Notes

- This dense value-domain scan is appropriate for the smaller bounds of version I.
