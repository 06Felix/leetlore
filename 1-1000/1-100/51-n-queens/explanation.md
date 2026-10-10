## Idea
- Place one queen per row, trying every column not blocked by column or diagonal bitmasks.
- Set the corresponding bits and board character, recurse to the next row, then undo the placement. Copy the board into strings when all rows are filled.

## Why It Works
- Row-by-row placement prevents shared rows, and the three masks exclude every column and diagonal attack.
- Every valid board has one allowed choice at each row, so exploring all choices finds every solution once. Copying completed rows keeps later backtracking from changing saved answers.

## Edge Cases
- n = 1 produces the single queen board; n = 2 or 3 produces no boards.
- Diagonal indices i + j and j - i + n - 1 stay nonnegative and within int bit width for n <= 9.

## Complexity
- O(n × n! + S n²) conservative time, including n-column scans and copying S completed boards.
- O(n²) working-board space and O(n) recursion, plus O(S n²) output.
