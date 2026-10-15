# Paths in Matrix Whose Sum Is Divisible by K

## Idea

- Memoize a recursive state (row, column, incoming remainder). Add the current cell modulo k, then sum the counts from moving down and right; at the destination test the completed sum.

## Why It Works

- Paths reaching the same cell with the same incoming remainder have identical valid suffix choices. The two possible next moves partition all paths, and the destination accepts exactly remainder-zero complete sums. Memoization evaluates each state once.

## Edge Cases

- Out-of-bounds moves contribute zero. A single cell is checked directly; k = 1 accepts every path.

## Complexity

- O(rows * cols * k) time and memo space, plus O(rows + cols) recursion stack.

## Notes

- Recursion can reach depth about 50000 for a thin grid, risking StackOverflowError in Java under valid constraints. The boxed Integer memo also adds allocation overhead. Fields and memo are reset on each public call.
