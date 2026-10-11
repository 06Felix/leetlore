# Painting a Grid With Three Different Colors

## Idea
- Build the grid column by column, encoding each color with two bits per row.
- Recursively choose colors differing from the previous column's same row and the current column's preceding row.
- Memoize completed column-start states by column index and previous-column mask.

## Why It Works
- The two checks enforce exactly the horizontal and vertical adjacency restrictions as each cell is filled.
- Once a column is complete, only its mask affects the next column; earlier columns no longer matter.
- Every legal coloring follows exactly one sequence of choices, and reaching column `n` contributes one completed coloring.

## Edge Cases
- The initial zero mask represents no left neighbor because valid colors are 1 through 3.
- One row or one column uses the same transitions; addition is reduced modulo $10^9+7$ after each branch.

## Complexity
- Time: $O(nmC^2)$ as a conservative bound, where $C=3\cdot2^{m-1}$ is the number of vertically valid columns.
- Space: $O(1000\cdot1024+nm)$ for the fixed memo table and cell-by-cell recursion stack.

## Notes
- Recursion can reach roughly $n(m+1)$ nested calls, creating a stack-overflow risk on large grids depending on the JVM stack limit.
- The memo table is not cleared between public calls; reusing one instance with different dimensions can return stale results. A zero result is also treated as uncached, potentially causing repeated work.
