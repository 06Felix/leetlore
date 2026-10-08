# Explanation

## Idea
- Map each matrix value to its row and column, and maintain painted-cell counts for both.
- Process `arr` in order and return immediately when its cell completes a row or column.

## Why It Works
- Unique values make each paint operation identify exactly one previously unpainted cell.
- A row is complete at its column count, and a column at its row count. Testing after each operation returns the earliest completion index.

## Edge Cases
- In a one-row or one-column matrix, the first paint already completes a column or row respectively.
- Completion of a row and column on the same operation still returns that single index.

## Complexity
- Time: $O(mn)$ for mapping and at most `mn` paint operations.
- Auxiliary space: $O(mn + m + n)$ for locations and counts.

## Notes
- The `||` expression skips the column increment if the row completes first. This is safe because the method returns immediately and never uses the skipped count afterward.
