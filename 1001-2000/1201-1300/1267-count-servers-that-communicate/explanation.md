# Explanation

## Idea
- Count servers in every row and column.
- Scan servers again and count one if its row or column contains more than one server.

## Why It Works
- A server communicates exactly when another server shares its row or column.
- Counts above one detect that condition, and the second pass counts each qualifying server once even if both directions qualify.

## Edge Cases
- An isolated server is excluded.
- Empty grids of server values produce zero; single rows or columns use the same count rule.

## Complexity
- Time: $O(mn)$ for two matrix passes.
- Auxiliary space: $O(m + n)$ for row and column counts.
