# Explanation

## Idea
- Use breadth-first traversal to collect each level's values in left-to-right order.
- Sort an array of their original indices by value, then repeatedly swap index entries until that permutation becomes the identity. Add those swaps across levels.

## Why It Works
- Sorted indices describe the permutation between the current level order and its desired order.
- A permutation cycle of length `c` requires exactly `c - 1` swaps. Swapping position `i` with position `id[i]` fixes one position per step and achieves this bound.
- Swaps cannot move values between levels, so each level's minimum contributes independently to the total.

## Edge Cases
- Already sorted levels and singleton levels contribute zero swaps.
- Unique node values make each level's target ordering unambiguous.

## Complexity
- Time: $O(\sum w_i\log(w_i + 1))$, at most $O(n\log n)$, for level widths `w_i`.
- Auxiliary space: $O(w)$ for maximum level width `w`, including the queue and per-level arrays.

## Notes
- The implementation counts swaps using the index array; it does not actually reorder tree node values.
