## Idea

- Track used digits for every row, column, and 3×3 box. Reject a filled cell if its digit has already appeared in any of its three groups, otherwise mark all three.

## Why It Works

- A repeated digit in any group violates exactly one of the Sudoku conditions. If all filled cells pass, every group has no duplicate digits, which is sufficient for validity of the partial board.

## Edge Cases

- Dots are skipped. An empty board is valid even though this check does not establish solvability.

## Complexity

- O(81) time and fixed O(1) space for the standard 9×9 board.
