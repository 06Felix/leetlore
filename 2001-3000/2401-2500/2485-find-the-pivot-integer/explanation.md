# Find the Pivot Integer

## Idea

- Compute the triangular total n(n + 1)/2. Take its integer square root and return it only if squaring it reproduces the total.

## Why It Works

- The pivot condition is x(x + 1)/2 = n(n + 1)/2 - x(x - 1)/2, which simplifies to x^2 = n(n + 1)/2. A positive perfect-square total therefore determines the unique pivot.

## Edge Cases

- n = 1 returns one. Non-square triangular totals return -1.

## Complexity

- O(1) time and O(1) auxiliary space under the fixed integer bounds.

## Notes

- The total is at most 500500, so both multiplication and the exact-square check are safe in int arithmetic.
