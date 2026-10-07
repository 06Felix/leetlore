# Explanation

## Idea
- Compute the full array sum in `long`.
- Move each element except the last from the remaining-right sum into the left sum, counting positions where the left sum is at least the right sum.

## Why It Works
- After moving index `i`, the two running sums exactly represent the prefix ending there and its remaining suffix.
- Testing every index before the last covers every legal nonempty split, and the comparison matches the required condition.

## Edge Cases
- Negative numbers and equal left/right totals need no special treatment; equality is valid.
- For two elements, exactly one split is examined.

## Complexity
- Time: $O(n)$ for the total-sum pass and split pass.
- Auxiliary space: $O(1)$.

## Notes
- Both sums use `long`, since the allowed array totals can exceed the integer range.
