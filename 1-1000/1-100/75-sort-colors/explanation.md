# Sort Colors

## Idea
- Count zeros in `c0` and all zeros plus ones in `c1`.
- Overwrite the input with zeros before `c0`, ones from `c0` through `c1 - 1`, and twos afterward.

## Why It Works
- The first count determines the zero block, and the cumulative second count determines the end of the one block.
- The remaining positions must be twos because the input contains only the three permitted colors; rewriting preserves their multiplicities in sorted order.

## Edge Cases
- Missing colors give empty blocks, and an array containing one color is rewritten to the same values.
- The array is sorted in place and no library sort is used.

## Complexity
- Time: $O(n)$ across two passes.
- Space: $O(1)$ auxiliary storage.

## Notes
- This implementation satisfies the main restrictions but does not satisfy the optional one-pass follow-up.
