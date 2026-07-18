# Explanation

## Idea

- Check whether any existing `2 x 2` square is already one color.
- If not, flip each cell one at a time and check again.
- Restore the cell after a failed trial.

## Why It Works

- The grid is only `3 x 3`, so there are four possible `2 x 2` squares.
- At most one color change is allowed, so trying every possible changed cell covers all choices.
- The helper verifies the exact condition: all four cells in a `2 x 2` block are equal.

## Edge Cases

- Already-valid grids return `true` immediately.
- Checkerboard-like grids can fail every one-flip attempt.
- Restoring each trial keeps later checks independent.

## Complexity

- Time: $O(1)$ because the grid size is fixed.
- Space: $O(1)$.
