## Idea

- Use dynamic programming for the two off-diagonal travelers and add the forced diagonal path.

## Why It Works

- Each DP state chooses the best of its three allowed predecessor cells, so it maximizes collected fruit for that traveler; the paths meet only at the final accounting.

## Edge Cases

- The diagonal and three corners initialize the forced starts.

## Complexity

- O(n²) time and O(n²) space.

## Notes

- The explanation follows the stored two-dimensional DP transitions.
