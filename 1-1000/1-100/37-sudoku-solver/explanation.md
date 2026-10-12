## Idea

- Backtrack through cells in row-major order. Try digits one through nine in each empty cell, validate its row, column, and box, and restore the empty marker when a choice fails.

## Why It Works

- Every branch preserves all Sudoku constraints. Trying each permitted digit covers every valid completion. Reaching cell 81 means all cells are filled consistently; failed branches restore the board before trying another digit.

## Edge Cases

- Given digits are skipped. A completed valid board returns immediately; the statement guarantees one solution.

## Complexity

- O(9^E) worst-case time for E empty cells, with constant-size validation scans. O(81) recursion stack space on the fixed board.

## Notes

- The board is filled in place, and successful recursive calls preserve their assignments.
