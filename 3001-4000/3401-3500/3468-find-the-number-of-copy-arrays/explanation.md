## Idea
- Propagate the feasible range for copy[i - 1] by the required original-array difference, then intersect it with bounds[i].
- Replace each bounds row with this intersected range. Return zero for an empty intersection; otherwise return the final inclusive range's size.

## Why It Works
- Matching differences make each next value a fixed translation of the preceding value, preserving a one-to-one correspondence between valid prefixes and feasible current values.
- Intersecting removes exactly the choices violating the next bound. Thus each integer in the final range represents one complete valid array.

## Edge Cases
- Increasing, decreasing, and zero differences all use the same translation.
- A singleton feasible range contributes one; disjoint ranges stop immediately with zero.

## Complexity
- O(n) time with constant work per row.
- O(n) cumulative allocation for replacement rows, but O(1) temporary space beyond the mutated bounds array; the original array is unchanged.

## Notes
- The method replaces rows in bounds, including an empty row on failure. Translated endpoints stay within int under the given 10^9 limits.
