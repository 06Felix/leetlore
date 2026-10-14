# Russian Doll Envelopes

## Idea

- Sort widths ascending and equal-width heights descending. Maintain an array of minimum ending heights for strictly increasing subsequences, replacing or extending it with binary search.

## Why It Works

- Descending heights prevent two equal-width envelopes from extending a chain. For each length, a smaller tail preserves every future extension; the occupied tail count is therefore the maximum valid nesting length.

## Edge Cases

- Equal heights replace an existing tail; identical envelopes contribute only one level.

## Complexity

- O(n log n) time and O(n) auxiliary space, including the tails array and object-array sort.

## Notes

- Sorting reorders the input. Rotation is never used.
