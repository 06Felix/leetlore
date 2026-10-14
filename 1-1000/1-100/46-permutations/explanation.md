## Idea

- Backtrack by swapping every remaining value into the current position, recur for the suffix, then undo the swap. Copy the full array when the final position is fixed.

## Why It Works

- Each recursion level chooses exactly one unused distinct value for its position. Every permutation corresponds to one such choice sequence, so all permutations are produced once. Undoing swaps restores the array for sibling branches.

## Edge Cases

- A one-value array produces one permutation. The input’s distinct-values guarantee prevents duplicate results.

## Complexity

- O(n·n!) time/output space and O(n) auxiliary recursion space.

## Notes

- The input array is restored after traversal. The instance answer list is not cleared in permute, so repeated calls on one object accumulate results.
