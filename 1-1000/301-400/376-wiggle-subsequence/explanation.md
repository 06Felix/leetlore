# Explanation

## Idea

- Track two best lengths while scanning left to right.
- `inc` is the best wiggle subsequence ending with a positive last difference.
- `dec` is the best one ending with a negative last difference.
- A rise extends a previous `dec`; a drop extends a previous `inc`.

## Why It Works

- A positive difference can only follow a negative difference in a wiggle sequence.
- A negative difference can only follow a positive difference.
- Equal adjacent values do not create a usable difference, so they are skipped.
- Future choices only need the sign of the last difference and the best length for that sign.

## Edge Cases

- A one-element array returns `1`.
- Strictly increasing or decreasing arrays return `2`.
- Consecutive equal values leave both states unchanged.

## Complexity

- Time: `O(n)`.
- Space: `O(1)`.
