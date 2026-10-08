# Explanation

## Idea
- Find each positive-cell connected component with recursive four-direction flood fill.
- Sum its fish while setting visited cells to zero, and keep the largest component sum.

## Why It Works
- The fisher can move throughout one water component and collect every fish there, but cannot cross zero-valued land to another component.
- Zeroing cells ensures every original water cell contributes once. Maximizing over components therefore selects the optimal starting region.

## Edge Cases
- An all-land grid returns zero.
- Diagonally touching water cells remain separate unless a four-direction path connects them.

## Complexity
- Time: $O(mn)$ because each cell is processed a constant number of times.
- Auxiliary space: $O(mn)$ in the worst case for recursion.

## Notes
- The input grid is modified: all explored water cells become zero.
