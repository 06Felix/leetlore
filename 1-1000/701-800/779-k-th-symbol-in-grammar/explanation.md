## Idea
- Recursively locate the parent at index ceil(k / 2) in the preceding row.
- Odd positions preserve the parent symbol; even positions flip it with XOR one. Stop at the first row or first position, whose symbol is zero.

## Why It Works
- Both replacement rules emit the parent symbol first and its complement second.
- Repeatedly applying the corresponding parent relation therefore recovers the requested symbol without constructing any row.

## Edge Cases
- k = 1 always returns zero.
- The first row has only one valid position; recursion handles both children of every later valid position.

## Complexity
- O(n) time and O(n) recursive-stack space in the worst case.
- The early first-position check can stop the recursion sooner.

## Notes
- Row n has 2^(n - 1) symbols. The imported statement displays the inconsistent bound k <= 2^n - 1; this implementation assumes an actually valid row position and does not reject nonexistent positions.
