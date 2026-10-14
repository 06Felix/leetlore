## Idea

- Place one queen per row, using bitmasks for occupied columns and both diagonal identifiers. Toggle the three bits when placing a queen and toggle them back after recursion.

## Why It Works

- One queen per row removes row conflicts. Columns and row+column / row−column+n identify the other attacking lines exactly. Trying every available column covers each valid board once; reaching row n counts a complete placement.

## Edge Cases

- n=1 gives one placement; n=2 or n=3 gives none. All mask indices fit int for n≤9.

## Complexity

- O(n·n!) conservative time and O(n) recursion space with constant-size bitmasks.

## Notes

- Backtracking restores masks, but ans is not reset in totalNQueens. Repeated calls on the same object accumulate counts.
