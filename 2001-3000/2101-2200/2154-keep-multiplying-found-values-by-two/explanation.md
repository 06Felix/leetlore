# Keep Multiplying Found Values by Two

## Idea

- Sort nums and scan once. Whenever the current entry equals the current target o, double o. Return the final target.

## Why It Works

- All values are positive, so doubling strictly increases the target. After finding a match, any later match for the doubled target must occur to its right in sorted order; earlier entries can never be needed again.

## Edge Cases

- An absent original value remains unchanged. Duplicate old targets do not cause extra doublings because the target has already increased.

## Complexity

- O(n log n) time and O(log n) sorting stack space, with O(1) additional scan space.

## Notes

- Sorting mutates nums. Since matched values are at most 1000, the final doubling stays within int range.
