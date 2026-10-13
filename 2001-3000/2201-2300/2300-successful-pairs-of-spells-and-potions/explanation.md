## Idea

- Sort potions. For each spell, binary-search the first potion whose product reaches success and count the suffix.

## Why It Works

- Positive spell strength makes products monotone in sorted potion order. The lower-bound search finds exactly the split between unsuccessful and successful pairs.

## Edge Cases

- No feasible potion returns zero; duplicate strengths count as separate potions. Long multiplication avoids product overflow.

## Complexity

- O(m log m+n log m) time; O(n) output and O(log m) sorting stack space.

## Notes

- The potion array is sorted in place.
