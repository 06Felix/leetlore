# Explanation

## Idea
- Sum the primary diagonal with increasing row and column indices, then the secondary diagonal with increasing rows and decreasing columns.
- For odd matrix size, subtract the center cell once.

## Why It Works
- The two scans visit exactly the cells of the two diagonals.
- Their only possible intersection is the center of an odd-sized matrix. Subtracting it removes the double count while retaining one contribution.

## Edge Cases
- A one-cell matrix counts its sole value once after the correction.
- Even-sized matrices have no shared diagonal cell and need no correction.

## Complexity
- Time: $O(n)$ for two diagonal scans.
- Auxiliary space: $O(1)$.
