# Build Array from Permutation

## Idea
- Allocate an answer array and set each entry to `nums[nums[i]]`.
- Read both indexing steps from the original input, leaving it unchanged.

## Why It Works
- The permutation guarantees every input value is a valid array index.
- Applying the two lookups directly implements the required formula for every position.

## Edge Cases
- A single-element permutation returns `[0]`; fixed points remain fixed.
- Cycles of the permutation are handled by the same two-step lookup.

## Complexity
- Time: $O(n)$ for one scan.
- Space: $O(n)$ for the returned array and $O(1)$ additional auxiliary storage.

## Notes
- The implementation allocates a separate array, so it does not meet the optional follow-up requesting an in-place solution with $O(1)$ memory.
