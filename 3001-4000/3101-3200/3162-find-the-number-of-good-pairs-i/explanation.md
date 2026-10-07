# Explanation

## Idea
- Enumerate every value from `nums1` with every value from `nums2`.
- Count the pair exactly when `x % (y * k) == 0`.

## Why It Works
- The nested loops visit every index pair once, including separate pairs containing equal values.
- A zero remainder is exactly the divisibility condition in the statement.

## Edge Cases
- Repeated values contribute separately because indices identify pairs.
- If `y * k` exceeds the positive `x`, that pair cannot be divisible.

## Complexity
- Time: $O(nm)$, at most 2500 pair checks under the constraints.
- Auxiliary space: $O(1)$.

## Notes
- The constraints keep the divisor positive and its product within the integer range.
