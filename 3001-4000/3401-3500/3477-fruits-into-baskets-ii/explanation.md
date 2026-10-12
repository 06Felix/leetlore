## Idea

- For each fruit, scan baskets left to right and take the first unused basket with enough capacity.

## Why It Works

- The statement requires the leftmost available feasible basket, so the direct scan simulates it exactly.

## Edge Cases

- Used baskets are skipped; an unmatched fruit increments the answer.

## Complexity

- O(n²) time and O(n) space.

## Notes

- The static initializer repeatedly calls the method with empty arrays. It does not alter results, but it is unnecessary runtime work.
