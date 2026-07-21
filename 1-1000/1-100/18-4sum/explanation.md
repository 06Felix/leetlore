# 4Sum

## Idea

- Sort `nums`.
- Use recursive backtracking to choose four numbers in increasing index order.
- Track remaining `target` as a `long`.
- Skip duplicate values at the same recursion depth.

## Why It Works

- Sorting groups equal values together so duplicate quadruplets can be skipped.
- Increasing `start` ensures each index is used at most once.
- When four numbers are chosen, `target == 0` means their sum equals the original target.
- Copying `current` records each valid quadruplet.

## Edge Cases

- Arrays with fewer than four values return an empty list.
- Repeated values produce one unique quadruplet because same-depth duplicates are skipped.
- `long` target arithmetic avoids overflow while subtracting large values.

## Complexity

- Time: $O(n^4)$ in this implementation.
- Space: $O(4)$ recursion path, excluding output.

## Notes

- This is a direct recursive k-choice solution, not the usual two-pointer optimized `O(n^3)` 4Sum.
